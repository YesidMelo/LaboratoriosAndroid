package com.hefesto.laboratoriosandroid.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.hefesto.laboratoriosandroid.ui.theme.LaboratoriosAndroidTheme

@Composable
fun Pantalla2View(
    modifier: Modifier = Modifier,
    navigateToExample: () -> Unit
) {

    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (textId, progressId) = createRefs()
        //region Pantalla1
        val guidelineEnd = createGuidelineFromEnd(0.06f)
        val guidelineStart = createGuidelineFromStart(0.06f)

        Text(
            //text = stringResource(id = R.string.jacs_long),
            text = "Pagina 2",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.constrainAs(textId) {
                bottom.linkTo(parent.bottom)
                end.linkTo(guidelineEnd)
                start.linkTo(guidelineStart)
                top.linkTo(parent.top)
                width = Dimension.fillToConstraints
            }.clickable { navigateToExample.invoke() },
            textAlign = TextAlign.Center
        )
        //endregion
    }
}


//region preview
@Preview(
    showBackground = true,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    device = Devices.PHONE
)
@Composable
fun Pantalla2ViewPreview() {
    LaboratoriosAndroidTheme {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
        ) {
            val constraintsId = createRef()
            Pantalla2View(modifier = Modifier.constrainAs(constraintsId) {
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
                start.linkTo(parent.start)
                top.linkTo(parent.top)
                width = Dimension.fillToConstraints
            },
                navigateToExample = {}
            )
        }
    }
}
//endregion