package se.byggappen.icons.byggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import se.byggappen.icons.ByggIcons

public val ByggIcons.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.4485f, 5.8019f)
                curveTo(14.6445f, 6.0189f, 14.8838f, 6.1924f, 15.1511f, 6.3112f)
                curveTo(15.4183f, 6.4299f, 15.7075f, 6.4913f, 15.9999f, 6.4913f)
                curveTo(16.2923f, 6.4913f, 16.5815f, 6.4299f, 16.8487f, 6.3112f)
                curveTo(17.116f, 6.1924f, 17.3553f, 6.0189f, 17.5513f, 5.8019f)
                lineTo(18.5542f, 4.6901f)
                curveTo(18.8434f, 4.3696f, 19.2248f, 4.1464f, 19.6459f, 4.0513f)
                curveTo(20.0671f, 3.9562f, 20.5073f, 3.9939f, 20.9062f, 4.1591f)
                curveTo(21.3051f, 4.3244f, 21.643f, 4.609f, 21.8735f, 4.9741f)
                curveTo(22.1041f, 5.3391f, 22.2159f, 5.7666f, 22.1937f, 6.1977f)
                lineTo(22.1169f, 7.6915f)
                curveTo(22.102f, 7.9836f, 22.1486f, 8.2757f, 22.2537f, 8.5487f)
                curveTo(22.3587f, 8.8218f, 22.5198f, 9.0698f, 22.7267f, 9.2767f)
                curveTo(22.9335f, 9.4836f, 23.1814f, 9.6449f, 23.4544f, 9.75f)
                curveTo(23.7274f, 9.8552f, 24.0195f, 9.9019f, 24.3117f, 9.8872f)
                lineTo(25.8054f, 9.8104f)
                curveTo(26.2363f, 9.7889f, 26.6633f, 9.9013f, 27.0278f, 10.1321f)
                curveTo(27.3923f, 10.3629f, 27.6765f, 10.7008f, 27.8413f, 11.0995f)
                curveTo(28.0061f, 11.4982f, 28.0435f, 11.9382f, 27.9483f, 12.3589f)
                curveTo(27.8532f, 12.7797f, 27.6302f, 13.1608f, 27.3099f, 13.4498f)
                lineTo(26.1981f, 14.4527f)
                curveTo(25.981f, 14.6487f, 25.8075f, 14.8881f, 25.6888f, 15.1553f)
                curveTo(25.57f, 15.4225f, 25.5086f, 15.7117f, 25.5086f, 16.0041f)
                curveTo(25.5086f, 16.2965f, 25.57f, 16.5857f, 25.6888f, 16.8529f)
                curveTo(25.8075f, 17.1201f, 25.981f, 17.3595f, 26.1981f, 17.5555f)
                lineTo(27.3099f, 18.5584f)
                curveTo(27.6304f, 18.8476f, 27.8536f, 19.2289f, 27.9487f, 19.6501f)
                curveTo(28.0438f, 20.0712f, 28.0061f, 20.5114f, 27.8409f, 20.9103f)
                curveTo(27.6756f, 21.3092f, 27.3909f, 21.6471f, 27.0259f, 21.8776f)
                curveTo(26.6609f, 22.1081f, 26.2334f, 22.22f, 25.8022f, 22.1978f)
                lineTo(24.3085f, 22.1209f)
                curveTo(24.0163f, 22.1061f, 23.7243f, 22.1527f, 23.4513f, 22.2577f)
                curveTo(23.1783f, 22.3628f, 22.9303f, 22.5239f, 22.7235f, 22.7308f)
                curveTo(22.5167f, 22.9376f, 22.3555f, 23.1855f, 22.2505f, 23.4585f)
                curveTo(22.1454f, 23.7315f, 22.0988f, 24.0235f, 22.1137f, 24.3157f)
                lineTo(22.1905f, 25.8094f)
                curveTo(22.2112f, 26.2396f, 22.0985f, 26.6656f, 21.8678f, 27.0293f)
                curveTo(21.6372f, 27.393f, 21.2998f, 27.6766f, 20.9018f, 27.8412f)
                curveTo(20.5038f, 28.0059f, 20.0647f, 28.0436f, 19.6445f, 27.9492f)
                curveTo(19.2243f, 27.8548f, 18.8435f, 27.6329f, 18.5542f, 27.3138f)
                lineTo(17.5513f, 26.202f)
                curveTo(17.3553f, 25.985f, 17.116f, 25.8115f, 16.8487f, 25.6927f)
                curveTo(16.5815f, 25.574f, 16.2923f, 25.5126f, 15.9999f, 25.5126f)
                curveTo(15.7075f, 25.5126f, 15.4183f, 25.574f, 15.1511f, 25.6927f)
                curveTo(14.8838f, 25.8115f, 14.6445f, 25.985f, 14.4485f, 26.202f)
                lineTo(13.4456f, 27.3138f)
                curveTo(13.1562f, 27.6319f, 12.7757f, 27.8531f, 12.356f, 27.947f)
                curveTo(11.9363f, 28.0409f, 11.4978f, 28.0031f, 11.1004f, 27.8387f)
                curveTo(10.703f, 27.6743f, 10.3659f, 27.3913f, 10.1353f, 27.0284f)
                curveTo(9.9046f, 26.6654f, 9.7915f, 26.2401f, 9.8114f, 25.8105f)
                lineTo(9.8883f, 24.3167f)
                curveTo(9.9037f, 24.024f, 9.8573f, 23.7312f, 9.7521f, 23.4575f)
                curveTo(9.6469f, 23.1839f, 9.4853f, 22.9354f, 9.2778f, 22.7283f)
                curveTo(9.0703f, 22.5212f, 8.8215f, 22.3601f, 8.5476f, 22.2554f)
                curveTo(8.2738f, 22.1508f, 7.9809f, 22.105f, 7.6881f, 22.1209f)
                lineTo(6.1944f, 22.1978f)
                curveTo(5.7635f, 22.2193f, 5.3365f, 22.1069f, 4.972f, 21.8761f)
                curveTo(4.6075f, 21.6453f, 4.3233f, 21.3074f, 4.1585f, 20.9087f)
                curveTo(3.9937f, 20.51f, 3.9563f, 20.07f, 4.0515f, 19.6492f)
                curveTo(4.1466f, 19.2285f, 4.3696f, 18.8474f, 4.6899f, 18.5584f)
                lineTo(5.8017f, 17.5555f)
                curveTo(6.0188f, 17.3595f, 6.1923f, 17.1201f, 6.311f, 16.8529f)
                curveTo(6.4298f, 16.5857f, 6.4912f, 16.2965f, 6.4912f, 16.0041f)
                curveTo(6.4912f, 15.7117f, 6.4298f, 15.4225f, 6.311f, 15.1553f)
                curveTo(6.1923f, 14.8881f, 6.0188f, 14.6487f, 5.8017f, 14.4527f)
                lineTo(4.6899f, 13.4498f)
                curveTo(4.3718f, 13.1604f, 4.1507f, 12.7799f, 4.0567f, 12.3602f)
                curveTo(3.9628f, 11.9405f, 4.0006f, 11.5021f, 4.165f, 11.1047f)
                curveTo(4.3294f, 10.7073f, 4.6124f, 10.3703f, 4.9754f, 10.1396f)
                curveTo(5.3384f, 9.9089f, 5.7637f, 9.7958f, 6.1933f, 9.8158f)
                lineTo(7.6871f, 9.8926f)
                curveTo(7.9798f, 9.9077f, 8.2724f, 9.861f, 8.5459f, 9.7557f)
                curveTo(8.8194f, 9.6505f, 9.0678f, 9.4888f, 9.2748f, 9.2814f)
                curveTo(9.4819f, 9.074f, 9.643f, 8.8253f, 9.7478f, 8.5516f)
                curveTo(9.8525f, 8.2779f, 9.8986f, 7.9852f, 9.8829f, 7.6925f)
                lineTo(9.8114f, 6.1977f)
                curveTo(9.7915f, 5.7681f, 9.9046f, 5.3428f, 10.1353f, 4.9798f)
                curveTo(10.3659f, 4.6169f, 10.703f, 4.3339f, 11.1004f, 4.1695f)
                curveTo(11.4978f, 4.0051f, 11.9363f, 3.9673f, 12.356f, 4.0612f)
                curveTo(12.7757f, 4.1551f, 13.1562f, 4.3763f, 13.4456f, 4.6944f)
                lineTo(14.4485f, 5.8019f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 16.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
