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

public val ByggIcons.Talk: ImageVector
    get() {
        if (_talk != null) {
            return _talk!!
        }
        _talk = Builder(name = "Talk", defaultWidth = 32.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 32.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF231F20)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.2065f, 22.5922f)
                curveTo(12.6735f, 22.4999f, 4.8464f, 25.3082f, 4.8464f, 25.3082f)
                curveTo(6.7692f, 23.5351f, 7.762f, 21.8235f, 7.5321f, 20.1221f)
                curveTo(6.4629f, 19.339f, 5.5892f, 18.3277f, 4.9773f, 17.1647f)
                curveTo(4.3654f, 16.0016f, 4.0312f, 14.7173f, 4.0f, 13.4088f)
                curveTo(4.0f, 8.2125f, 9.225f, 4.0f, 15.7563f, 4.0f)
                curveTo(22.2875f, 4.0f, 27.5125f, 8.2125f, 27.5125f, 13.4088f)
                curveTo(27.5125f, 18.6052f, 22.2457f, 22.8484f, 15.7563f, 22.8484f)
                curveTo(14.9002f, 22.8377f, 14.0469f, 22.752f, 13.2065f, 22.5922f)
                verticalLineTo(22.5922f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF231F20)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.7523f, 7.2695f)
                curveTo(21.3053f, 7.987f, 23.9387f, 10.5493f, 23.9387f, 13.6138f)
                curveTo(23.9065f, 14.5925f, 23.6366f, 15.5495f, 23.1513f, 16.4052f)
                curveTo(22.666f, 17.2609f, 21.9793f, 17.9905f, 21.1485f, 18.5335f)
            }
        }
        .build()
        return _talk!!
    }

private var _talk: ImageVector? = null
