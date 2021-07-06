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

public val ByggIcons.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3B4249)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                horizontalLineTo(28.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3B4249)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.4f, 4.0f)
                horizontalLineTo(13.6f)
                curveTo(13.1757f, 4.0f, 12.7687f, 4.158f, 12.4686f, 4.4393f)
                curveTo(12.1686f, 4.7206f, 12.0f, 5.1022f, 12.0f, 5.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.5f)
                curveTo(20.0f, 5.1022f, 19.8314f, 4.7206f, 19.5314f, 4.4393f)
                curveTo(19.2313f, 4.158f, 18.8243f, 4.0f, 18.4f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3B4249)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 22.0f)
                verticalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3B4249)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                verticalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3B4249)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.4891f, 26.3947f)
                curveTo(23.4551f, 26.8323f, 23.2686f, 27.2402f, 22.9665f, 27.5376f)
                curveTo(22.6644f, 27.835f, 22.2688f, 28.0f, 21.8582f, 28.0f)
                horizontalLineTo(10.1429f)
                curveTo(9.7323f, 28.0f, 9.3367f, 27.835f, 9.0346f, 27.5376f)
                curveTo(8.7325f, 27.2402f, 8.5459f, 26.8323f, 8.512f, 26.3947f)
                lineTo(7.0f, 7.0f)
                horizontalLineTo(25.0f)
                lineTo(23.4891f, 26.3947f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
