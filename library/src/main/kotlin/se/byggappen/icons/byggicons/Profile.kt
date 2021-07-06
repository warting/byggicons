package se.byggappen.icons.byggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import se.byggappen.icons.ByggIcons

public val ByggIcons.Profile: ImageVector
    get() {
        if (_profile != null) {
            return _profile!!
        }
        _profile = Builder(name = "Profile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.4284f, 29.0f)
                verticalLineTo(21.7604f)
                curveTo(5.8493f, 20.2812f, 4.748f, 18.3549f, 4.2683f, 16.2331f)
                curveTo(3.7887f, 14.1112f, 3.953f, 11.8924f, 4.7398f, 9.8664f)
                curveTo(5.5266f, 7.8404f, 6.8993f, 6.1014f, 8.6786f, 4.8764f)
                curveTo(10.458f, 3.6515f, 12.5613f, 2.9976f, 14.7139f, 3.0f)
                curveTo(23.2851f, 3.0f, 24.7971f, 10.5111f, 27.9993f, 18.6f)
                horizontalLineTo(24.5708f)
                verticalLineTo(22.0667f)
                curveTo(24.5708f, 22.9861f, 24.2096f, 23.8678f, 23.5666f, 24.518f)
                curveTo(22.9236f, 25.1681f, 22.0516f, 25.5333f, 21.1423f, 25.5333f)
                horizontalLineTo(19.4281f)
                verticalLineTo(29.0f)
            }
        }
        .build()
        return _profile!!
    }

private var _profile: ImageVector? = null
