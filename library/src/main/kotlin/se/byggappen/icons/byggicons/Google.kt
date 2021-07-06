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

public val ByggIcons.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.8107f, 12.5241f)
                lineTo(5.9854f, 9.4682f)
                moveTo(9.8214f, 19.5622f)
                lineTo(6.1558f, 22.863f)
                moveTo(20.1894f, 21.7663f)
                lineTo(23.4607f, 25.4397f)
                moveTo(22.5123f, 18.902f)
                horizontalLineTo(17.5787f)
                verticalLineTo(14.4619f)
                horizontalLineTo(28.0f)
                verticalLineTo(16.6554f)
                curveTo(27.8488f, 19.4181f, 26.7468f, 22.0437f, 24.8807f, 24.0877f)
                curveTo(23.0145f, 26.1317f, 20.4988f, 27.4685f, 17.7595f, 27.8718f)
                curveTo(15.0202f, 28.2751f, 12.2255f, 27.7201f, 9.8487f, 26.3008f)
                curveTo(7.4719f, 24.8815f, 5.6589f, 22.6851f, 4.7167f, 20.0834f)
                curveTo(3.7745f, 17.4817f, 3.7609f, 14.6346f, 4.6783f, 12.0241f)
                curveTo(5.5957f, 9.4135f, 7.3878f, 7.2f, 9.751f, 5.7582f)
                curveTo(12.1142f, 4.3163f, 14.9034f, 3.7348f, 17.6464f, 4.1121f)
                curveTo(20.3895f, 4.4894f, 22.9178f, 5.8022f, 24.8033f, 7.8284f)
                lineTo(21.1804f, 11.1611f)
                curveTo(20.5192f, 10.4532f, 19.719f, 9.8893f, 18.8297f, 9.5045f)
                curveTo(17.9405f, 9.1198f, 16.9814f, 8.9226f, 16.0124f, 8.9251f)
                curveTo(14.7326f, 8.9253f, 13.4766f, 9.2708f, 12.377f, 9.925f)
                curveTo(11.2775f, 10.5793f, 10.3751f, 11.5181f, 9.7651f, 12.6423f)
                curveTo(9.1552f, 13.7665f, 8.8603f, 15.0345f, 8.9117f, 16.3122f)
                curveTo(8.9631f, 17.59f, 9.3588f, 18.8302f, 10.057f, 19.9019f)
                curveTo(10.7552f, 20.9736f, 11.73f, 21.8371f, 12.8786f, 22.4011f)
                curveTo(14.0272f, 22.9651f, 15.3068f, 23.2088f, 16.5825f, 23.1064f)
                curveTo(17.8581f, 23.004f, 19.0824f, 22.5593f, 20.1262f, 21.8193f)
                curveTo(21.1699f, 21.0793f, 21.9943f, 20.0714f, 22.5123f, 18.902f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
