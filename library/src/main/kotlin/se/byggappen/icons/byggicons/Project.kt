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

public val ByggIcons.Project: ImageVector
    get() {
        if (_project != null) {
            return _project!!
        }
        _project = Builder(name = "Project", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.1137f, 5.101f)
                lineTo(16.6446f, 7.5701f)
                curveTo(16.0366f, 8.1781f, 16.0366f, 9.164f, 16.6446f, 9.772f)
                lineTo(22.228f, 15.3554f)
                curveTo(22.8361f, 15.9634f, 23.8219f, 15.9634f, 24.4299f, 15.3554f)
                lineTo(26.899f, 12.8863f)
                curveTo(27.5071f, 12.2782f, 27.5071f, 11.2924f, 26.899f, 10.6843f)
                lineTo(21.3157f, 5.101f)
                curveTo(20.7076f, 4.4929f, 19.7218f, 4.4929f, 19.1137f, 5.101f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 12.8285f)
                lineTo(15.0f, 16.8285f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0468f, 22.4876f)
                curveTo(16.6571f, 21.9325f, 17.0f, 21.1798f, 17.0f, 20.395f)
                curveTo(17.0f, 19.6102f, 16.6571f, 18.8575f, 16.0468f, 18.3025f)
                lineTo(13.8025f, 16.2622f)
                curveTo(13.6513f, 16.1247f, 13.4718f, 16.0156f, 13.2743f, 15.9412f)
                curveTo(13.0767f, 15.8668f, 12.8649f, 15.8285f, 12.6511f, 15.8285f)
                curveTo(12.4372f, 15.8285f, 12.2254f, 15.8668f, 12.0279f, 15.9412f)
                curveTo(11.8303f, 16.0156f, 11.6508f, 16.1247f, 11.4996f, 16.2622f)
                lineTo(6.4772f, 20.8281f)
                curveTo(6.3259f, 20.9656f, 6.2059f, 21.1287f, 6.124f, 21.3083f)
                curveTo(6.0421f, 21.488f, 6.0f, 21.6805f, 6.0f, 21.8749f)
                curveTo(6.0f, 22.0693f, 6.0421f, 22.2618f, 6.124f, 22.4414f)
                curveTo(6.2059f, 22.621f, 6.3259f, 22.7842f, 6.4772f, 22.9216f)
                lineTo(8.7214f, 24.9619f)
                curveTo(9.332f, 25.5168f, 10.1599f, 25.8285f, 11.0232f, 25.8285f)
                curveTo(11.8865f, 25.8285f, 12.7145f, 25.5168f, 13.325f, 24.9619f)
                lineTo(16.0468f, 22.4876f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5017f, 16.3896f)
                curveTo(14.1761f, 15.95f, 14.0f, 15.4147f, 14.0f, 14.8644f)
                curveTo(14.0f, 14.3141f, 14.1761f, 13.7787f, 14.5017f, 13.3392f)
                curveTo(14.6434f, 13.1785f, 14.8168f, 13.0499f, 15.0106f, 12.9619f)
                curveTo(15.2044f, 12.8739f, 15.4142f, 12.8285f, 15.6265f, 12.8285f)
                curveTo(15.8387f, 12.8285f, 16.0486f, 12.8739f, 16.2424f, 12.9619f)
                curveTo(16.4362f, 13.0499f, 16.6096f, 13.1785f, 16.7513f, 13.3392f)
                lineTo(20.8117f, 17.4684f)
                curveTo(21.0663f, 17.7273f, 21.2683f, 18.0346f, 21.406f, 18.3729f)
                curveTo(21.5438f, 18.7112f, 21.6148f, 19.0738f, 21.6148f, 19.4399f)
                curveTo(21.6148f, 19.8061f, 21.5438f, 20.1687f, 21.406f, 20.5069f)
                curveTo(21.2683f, 20.8452f, 21.0663f, 21.1526f, 20.8117f, 21.4115f)
                curveTo(20.6723f, 21.5531f, 20.5617f, 21.7213f, 20.4863f, 21.9064f)
                curveTo(20.4109f, 22.0915f, 20.3721f, 22.2899f, 20.3721f, 22.4903f)
                curveTo(20.3721f, 22.6907f, 20.4109f, 22.8891f, 20.4863f, 23.0742f)
                curveTo(20.5617f, 23.2593f, 20.6723f, 23.4275f, 20.8117f, 23.5691f)
                lineTo(25.0f, 27.8285f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 23.8285f)
                lineTo(4.0f, 27.8285f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 25.8285f)
                lineTo(13.0f, 27.8285f)
            }
        }
        .build()
        return _project!!
    }

private var _project: ImageVector? = null
