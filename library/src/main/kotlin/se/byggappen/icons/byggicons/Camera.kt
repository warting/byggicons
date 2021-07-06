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

public val ByggIcons.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 18.0f)
                curveTo(18.2091f, 18.0f, 20.0f, 16.2091f, 20.0f, 14.0f)
                curveTo(20.0f, 11.7909f, 18.2091f, 10.0f, 16.0f, 10.0f)
                curveTo(13.7909f, 10.0f, 12.0f, 11.7909f, 12.0f, 14.0f)
                curveTo(12.0f, 16.2091f, 13.7909f, 18.0f, 16.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.8f, 7.288f)
                horizontalLineTo(22.4f)
                lineTo(21.6843f, 5.8172f)
                curveTo(21.4185f, 5.2711f, 21.01f, 4.8119f, 20.5045f, 4.491f)
                curveTo(19.999f, 4.17f, 19.4166f, 4.0f, 18.8224f, 4.0f)
                horizontalLineTo(13.1776f)
                curveTo(12.5834f, 4.0f, 12.001f, 4.17f, 11.4955f, 4.491f)
                curveTo(10.99f, 4.8119f, 10.5815f, 5.2711f, 10.3157f, 5.8172f)
                lineTo(9.6f, 7.288f)
                horizontalLineTo(7.2f)
                curveTo(6.3513f, 7.288f, 5.5374f, 7.6344f, 4.9373f, 8.251f)
                curveTo(4.3371f, 8.8676f, 4.0f, 9.7039f, 4.0f, 10.576f)
                verticalLineTo(18.7959f)
                curveTo(4.0f, 19.668f, 4.3371f, 20.5043f, 4.9373f, 21.1209f)
                curveTo(5.5374f, 21.7375f, 6.3513f, 22.0839f, 7.2f, 22.0839f)
                horizontalLineTo(11.7333f)
                lineTo(15.3344f, 27.634f)
                curveTo(15.4075f, 27.7466f, 15.5064f, 27.8389f, 15.6225f, 27.9028f)
                curveTo(15.7387f, 27.9666f, 15.8683f, 28.0f, 16.0f, 28.0f)
                curveTo(16.1317f, 28.0f, 16.2613f, 27.9666f, 16.3775f, 27.9028f)
                curveTo(16.4936f, 27.8389f, 16.5925f, 27.7466f, 16.6656f, 27.634f)
                lineTo(20.2667f, 22.0839f)
                horizontalLineTo(24.8f)
                curveTo(25.6487f, 22.0839f, 26.4626f, 21.7375f, 27.0627f, 21.1209f)
                curveTo(27.6629f, 20.5043f, 28.0f, 19.668f, 28.0f, 18.7959f)
                verticalLineTo(10.576f)
                curveTo(28.0f, 9.7039f, 27.6629f, 8.8676f, 27.0627f, 8.251f)
                curveTo(26.4626f, 7.6344f, 25.6487f, 7.288f, 24.8f, 7.288f)
                verticalLineTo(7.288f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
