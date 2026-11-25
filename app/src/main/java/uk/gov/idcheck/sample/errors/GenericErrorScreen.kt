package uk.gov.idcheck.sample.errors

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uk.gov.idcheck.sample.R

@Composable
fun GenericErrorScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().safeDrawingPadding().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        ) {
            Image(
                painter = painterResource(R.drawable.ic_error_unfilled),
                contentDescription = null,
                modifier = Modifier.size(100.dp),
            )
            Text(
                text = stringResource(R.string.idsdk_something_went_wrong_title),
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center,
            )
            Text(
                text = stringResource(R.string.idsdk_try_again_subtitle),
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
            )
        }
        Spacer(Modifier.size(16.dp))
        Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
            Text(stringResource(R.string.goBackTryAgainButton))
        }
        TextButton(onClick = {}, modifier = Modifier.fillMaxWidth()) {
            Text(stringResource(R.string.proveAnotherWaySecondaryButton), textAlign = TextAlign.Center)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GenericErrorScreenPreview() {
    MaterialTheme { GenericErrorScreen() }
}
