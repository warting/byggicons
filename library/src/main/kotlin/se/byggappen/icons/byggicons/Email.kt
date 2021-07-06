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

public val ByggIcons.Email: ImageVector
    get() {
        if (_email != null) {
            return _email!!
        }
        _email = Builder(name = "Email", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(26.2857f, 7.0f)
                horizontalLineTo(5.7143f)
                curveTo(4.7675f, 7.0f, 4.0f, 7.7611f, 4.0f, 8.7f)
                verticalLineTo(22.3f)
                curveTo(4.0f, 23.2389f, 4.7675f, 24.0f, 5.7143f, 24.0f)
                horizontalLineTo(26.2857f)
                curveTo(27.2325f, 24.0f, 28.0f, 23.2389f, 28.0f, 22.3f)
                verticalLineTo(8.7f)
                curveTo(28.0f, 7.7611f, 27.2325f, 7.0f, 26.2857f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(28.0f, 8.0f)
                lineTo(18.3821f, 15.2103f)
                curveTo(17.6991f, 15.7224f, 16.8616f, 16.0f, 16.0f, 16.0f)
                curveTo(15.1384f, 16.0f, 14.3009f, 15.7224f, 13.618f, 15.2103f)
                lineTo(4.0f, 8.0f)
            }
        }
        .build()
        return _email!!
    }

private var _email: ImageVector? = null
