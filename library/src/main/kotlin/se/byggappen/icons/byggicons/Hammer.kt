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

public val ByggIcons.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.163f, 17.2975f)
                curveTo(14.4182f, 16.6055f, 13.9999f, 15.6671f, 14.0f, 14.6886f)
                curveTo(14.0001f, 13.7101f, 14.4186f, 12.7717f, 15.1635f, 12.0798f)
                curveTo(15.9084f, 11.388f, 16.9186f, 10.9994f, 17.9719f, 10.9995f)
                curveTo(19.0253f, 10.9996f, 20.0354f, 11.3884f, 20.7801f, 12.0803f)
                lineTo(25.8353f, 16.7813f)
                curveTo(26.2045f, 17.1238f, 26.4974f, 17.5305f, 26.6973f, 17.9781f)
                curveTo(26.8971f, 18.4258f, 27.0f, 18.9057f, 27.0f, 19.3904f)
                curveTo(27.0f, 19.8751f, 26.8971f, 20.355f, 26.6973f, 20.8027f)
                curveTo(26.4974f, 21.2504f, 26.2045f, 21.6571f, 25.8353f, 21.9995f)
                lineTo(23.5828f, 19.907f)
                curveTo(22.8063f, 19.2732f, 21.8079f, 18.9236f, 20.7742f, 18.9236f)
                curveTo(19.7405f, 18.9236f, 18.7422f, 19.2732f, 17.9657f, 19.907f)
                lineTo(15.163f, 17.2975f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.9263f, 6.7995f)
                lineTo(13.1268f, 4.0f)
                lineTo(7.5278f, 9.599f)
                lineTo(10.3273f, 12.3985f)
                lineTo(15.9263f, 6.7995f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 7.9995f)
                lineTo(18.0f, 10.9995f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                lineTo(14.0f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.387f, 16.0f)
                lineTo(5.5914f, 24.6221f)
                curveTo(5.2127f, 24.9932f, 5.0f, 25.4965f, 5.0f, 26.0213f)
                curveTo(5.0f, 26.5461f, 5.2127f, 27.0494f, 5.5914f, 27.4204f)
                curveTo(5.9701f, 27.7915f, 6.4837f, 28.0f, 7.0193f, 28.0f)
                curveTo(7.5548f, 28.0f, 8.0685f, 27.7915f, 8.4472f, 27.4204f)
                lineTo(17.0f, 19.0383f)
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
