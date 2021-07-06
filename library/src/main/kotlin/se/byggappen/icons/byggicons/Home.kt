package se.byggappen.icons.byggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import se.byggappen.icons.ByggIcons

public val ByggIcons.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                verticalLineTo(27.0f)
                horizontalLineTo(13.5455f)
                verticalLineTo(20.4545f)
                curveTo(13.5455f, 20.0206f, 13.7179f, 19.6043f, 14.0247f, 19.2975f)
                curveTo(14.3316f, 18.9906f, 14.7478f, 18.8182f, 15.1818f, 18.8182f)
                horizontalLineTo(16.8182f)
                curveTo(17.2522f, 18.8182f, 17.6684f, 18.9906f, 17.9753f, 19.2975f)
                curveTo(18.2821f, 19.6043f, 18.4545f, 20.0206f, 18.4545f, 20.4545f)
                verticalLineTo(27.0f)
                horizontalLineTo(25.0f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 17.0f)
                lineTo(14.8683f, 5.4964f)
                curveTo(15.0169f, 5.339f, 15.1933f, 5.2142f, 15.3875f, 5.129f)
                curveTo(15.5817f, 5.0438f, 15.7898f, 5.0f, 16.0f, 5.0f)
                curveTo(16.2102f, 5.0f, 16.4183f, 5.0438f, 16.6125f, 5.129f)
                curveTo(16.8067f, 5.2142f, 16.9831f, 5.339f, 17.1317f, 5.4964f)
                lineTo(28.0f, 17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 9.4286f)
                verticalLineTo(8.0f)
                horizontalLineTo(25.0f)
                verticalLineTo(13.0f)
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
