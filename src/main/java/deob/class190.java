package deob;

import java.util.LinkedList;

@ObfuscatedName("gl")
public abstract class class190 {

    @ObfuscatedName("gl.o")
    public int field2152;

    @ObfuscatedName("gl.g")
    public int field2145;

    @ObfuscatedName("gl.e")
    public int field2147;

    @ObfuscatedName("gl.p")
    public int field2148;

    @ObfuscatedName("gl.j")
    public int field2156;

    @ObfuscatedName("gl.b")
    public int field2149;

    @ObfuscatedName("gl.x")
    public int field2151 = -1;

    @ObfuscatedName("gl.y")
    public int field2158 = -1;

    @ObfuscatedName("gl.k")
    public short[][][] field2153;

    @ObfuscatedName("gl.t")
    public short[][][] field2154;

    @ObfuscatedName("gl.l")
    public byte[][][] field2155;

    @ObfuscatedName("gl.u")
    public byte[][][] field2146;

    @ObfuscatedName("gl.n")
    public class192[][][][] field2157;

    @ObfuscatedName("gl.z")
    public boolean field2159;

    @ObfuscatedName("gl.q")
    public boolean field2150;

    public class190() {
        new LinkedList();
        this.field2159 = false;
        this.field2150 = false;
    }

    @ObfuscatedName("gl.f(B)Z")
    public boolean method3545() {
        return this.field2159 && this.field2150;
    }

    @ObfuscatedName("gl.h(Lko;I)V")
    public void method3538(class290 arg0) {
        if (this.method3545()) {
            return;
        }
        byte[] var2 = arg0.method4743(this.field2151, this.field2158);
        if (var2 != null) {
            this.method3197(new class401(var2));
            this.field2159 = true;
            this.field2150 = true;
        }
    }

    @ObfuscatedName("gl.v(I)V")
    public void method3542() {
        this.field2153 = (short[][][]) null;
        this.field2154 = (short[][][]) null;
        this.field2155 = (byte[][][]) null;
        this.field2146 = (byte[][][]) null;
        this.field2157 = (class192[][][][]) null;
        this.field2159 = false;
        this.field2150 = false;
    }

    @ObfuscatedName("gl.ag(IILop;I)V")
    public void method3539(int arg0, int arg1, class401 arg2) {
        int var4 = arg2.method6240();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method3541(arg0, arg1, arg2, var4);
        } else {
            this.method3540(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("gl.ae(IILop;II)V")
    public void method3540(int arg0, int arg1, class401 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2154[0][arg0][arg1] = (short) arg2.method6240();
        }
        this.field2153[0][arg0][arg1] = (short) arg2.method6240();
    }

    @ObfuscatedName("gl.aq(IILop;II)V")
    public void method3541(int arg0, int arg1, class401 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2153[0][arg0][arg1] = (short) arg2.method6240();
        if (var6) {
            int var8 = arg2.method6240();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method6240();
                if (var10 != 0) {
                    this.field2154[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method6240();
                    this.field2155[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2146[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method6240();
            if (var13 != 0) {
                class192[] var14 = this.field2157[var12][arg0][arg1] = new class192[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method6220();
                    int var17 = arg2.method6240();
                    var14[var15] = new class192(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("gl.al(I)I")
    public int method3543() {
        return this.field2147;
    }

    @ObfuscatedName("gl.am(I)I")
    public int method3544() {
        return this.field2148;
    }

    @ObfuscatedName("gl.w(Lop;I)V")
    public abstract void method3197(class401 arg0);
}
