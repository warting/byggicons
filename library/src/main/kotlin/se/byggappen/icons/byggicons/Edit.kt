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

public val ByggIcons.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(26.8691f, 5.1309f)
                curveTo(26.5058f, 4.7692f, 26.0745f, 4.483f, 25.5999f, 4.2889f)
                curveTo(25.1254f, 4.0948f, 24.6172f, 3.9966f, 24.1045f, 4.0001f)
                curveTo(23.5918f, 4.0036f, 23.085f, 4.1086f, 22.6131f, 4.3091f)
                curveTo(22.1413f, 4.5096f, 21.7139f, 4.8016f, 21.3555f, 5.1683f)
                lineTo(5.889f, 20.6348f)
                lineTo(4.0f, 28.0f)
                lineTo(11.3652f, 26.111f)
                lineTo(26.8317f, 10.6445f)
                curveTo(27.1984f, 10.2861f, 27.4904f, 9.8587f, 27.6909f, 9.3869f)
                curveTo(27.8914f, 8.915f, 27.9964f, 8.4081f, 27.9999f, 7.8955f)
                curveTo(28.0034f, 7.3828f, 27.9052f, 6.8746f, 27.7111f, 6.4001f)
                curveTo(27.517f, 5.9255f, 27.2308f, 5.4942f, 26.8691f, 5.1309f)
                verticalLineTo(5.1309f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 6.0003f)
                lineTo(26.0f, 11.0004f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 8.0003f)
                lineTo(24.0f, 13.0004f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 21.0004f)
                lineTo(11.0f, 26.0004f)
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
