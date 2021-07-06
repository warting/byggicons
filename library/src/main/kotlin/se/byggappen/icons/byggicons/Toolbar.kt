package se.byggappen.icons.byggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import se.byggappen.icons.ByggIcons

public val ByggIcons.Toolbar: ImageVector
    get() {
        if (_toolbar != null) {
            return _toolbar!!
        }
        _toolbar = Builder(name = "Toolbar", defaultWidth = 32.0.dp, defaultHeight = 31.0.dp,
                viewportWidth = 32.0f, viewportHeight = 31.0f).apply {
            path(fill = SolidColor(Color(0xFF3B4249)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                curveTo(19.0f, 7.6568f, 17.6569f, 9.0f, 16.0f, 9.0f)
                curveTo(14.3431f, 9.0f, 13.0f, 7.6568f, 13.0f, 6.0f)
                curveTo(13.0f, 4.3432f, 14.3431f, 3.0f, 16.0f, 3.0f)
                curveTo(17.6569f, 3.0f, 19.0f, 4.3432f, 19.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3B4249)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.5f)
                curveTo(19.0f, 17.1569f, 17.6569f, 18.5f, 16.0f, 18.5f)
                curveTo(14.3431f, 18.5f, 13.0f, 17.1569f, 13.0f, 15.5f)
                curveTo(13.0f, 13.8431f, 14.3431f, 12.5f, 16.0f, 12.5f)
                curveTo(17.6569f, 12.5f, 19.0f, 13.8431f, 19.0f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3B4249)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 25.0f)
                curveTo(19.0f, 26.6569f, 17.6569f, 28.0f, 16.0f, 28.0f)
                curveTo(14.3431f, 28.0f, 13.0f, 26.6569f, 13.0f, 25.0f)
                curveTo(13.0f, 23.3431f, 14.3431f, 22.0f, 16.0f, 22.0f)
                curveTo(17.6569f, 22.0f, 19.0f, 23.3431f, 19.0f, 25.0f)
                close()
            }
        }
        .build()
        return _toolbar!!
    }

private var _toolbar: ImageVector? = null
