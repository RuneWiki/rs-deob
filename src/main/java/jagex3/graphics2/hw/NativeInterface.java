package jagex3.graphics2.hw;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagex3/graphics2/hw/NativeInterface")
public class NativeInterface {

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "copyLighting", descriptor = "([S[B[S[S[S[S[BII[SIIIJ)V")
    public final native void copyLighting(short[] arg0, byte[] arg1, short[] arg2, short[] arg3, short[] arg4, short[] arg5, byte[] arg6, int arg7, int arg8, short[] arg9, int arg10, int arg11, int arg12, long arg13);

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "copyColours", descriptor = "([S[B[SI[SIIIJ)V")
    public final native void copyColours(short[] arg0, byte[] arg1, short[] arg2, int arg3, short[] arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "copyTexCoords", descriptor = "([F[FIIIJ)V")
    public final native void copyTexCoords(float[] arg0, float[] arg1, int arg2, int arg3, int arg4, long arg5);

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "copyNormals", descriptor = "([S[S[S[BFFIIIJ)V")
    public final native void copyNormals(short[] arg0, short[] arg1, short[] arg2, byte[] arg3, float arg4, float arg5, int arg6, int arg7, int arg8, long arg9);

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "setAmbient", descriptor = "(F)V")
    public final native void setAmbient(float arg0);

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "release", descriptor = "()V")
    public final native void release();

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "initTextureMetrics", descriptor = "(IBB)V")
    public final native void initTextureMetrics(int arg0, byte arg1, byte arg2);

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "setSunColour", descriptor = "(FFFFF)V")
    public final native void setSunColour(float arg0, float arg1, float arg2, float arg3, float arg4);

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "init", descriptor = "(II)V")
    private final native void init(int arg0, int arg1);

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "<init>", descriptor = "(II)V")
    public NativeInterface(int arg0, int arg1) {
        this.init(arg0, arg1);
    }

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "copyPositions", descriptor = "([I[I[I[SIIIJ)V")
    public final native void copyPositions(int[] arg0, int[] arg1, int[] arg2, short[] arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "setSunDirection", descriptor = "(FFF)V")
    public final native void setSunDirection(float arg0, float arg1, float arg2);
}
