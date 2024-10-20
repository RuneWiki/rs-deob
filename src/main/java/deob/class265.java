package deob;

import java.util.LinkedList;

@ObfuscatedName("kc")
public abstract class class265 {

    @ObfuscatedName("kc.ax")
    public int field2984;

    @ObfuscatedName("kc.ap")
    public int field2980;

    @ObfuscatedName("kc.ab")
    public int field2993;

    @ObfuscatedName("kc.ak")
    public int field2982;

    @ObfuscatedName("kc.ae")
    public int field2983;

    @ObfuscatedName("kc.af")
    public int field2981;

    @ObfuscatedName("kc.ao")
    public int field2985 = -1;

    @ObfuscatedName("kc.aa")
    public int field2990 = -1;

    @ObfuscatedName("kc.aj")
    public short[][][] field2987;

    @ObfuscatedName("kc.ad")
    public short[][][] field2988;

    @ObfuscatedName("kc.ac")
    public byte[][][] field2989;

    @ObfuscatedName("kc.ag")
    public byte[][][] field2986;

    @ObfuscatedName("kc.ar")
    public class267[][][][] field2991;

    @ObfuscatedName("kc.ah")
    public boolean field2992;

    @ObfuscatedName("kc.az")
    public boolean field2979;

    public class265() {
        new LinkedList();
        this.field2992 = false;
        this.field2979 = false;
    }

    @ObfuscatedName("kc.aq(I)Z")
    public boolean method4960() {
        return this.field2992 && this.field2979;
    }

    @ObfuscatedName("kc.aw(Lnq;S)V")
    public void method4986(class357 arg0) {
        if (this.method4960()) {
            return;
        }
        byte[] var2 = arg0.method6080(this.field2985, this.field2990);
        if (var2 != null) {
            this.method4635(new class501(var2));
            this.field2992 = true;
            this.field2979 = true;
        }
    }

    @ObfuscatedName("kc.ay(B)V")
    public void method4981() {
        this.field2987 = (short[][][]) null;
        this.field2988 = (short[][][]) null;
        this.field2989 = (byte[][][]) null;
        this.field2986 = (byte[][][]) null;
        this.field2991 = (class267[][][][]) null;
        this.field2992 = false;
        this.field2979 = false;
    }

    @ObfuscatedName("kc.al(IILtz;B)V")
    public void method4974(int arg0, int arg1, class501 arg2) {
        int var4 = arg2.method8129();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4964(arg0, arg1, arg2, var4);
        } else {
            this.method4962(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("kc.am(IILtz;IB)V")
    public void method4962(int arg0, int arg1, class501 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2988[0][arg0][arg1] = (short) arg2.method8195();
        }
        this.field2987[0][arg0][arg1] = (short) arg2.method8195();
    }

    @ObfuscatedName("kc.bs(IILtz;II)V")
    public void method4964(int arg0, int arg1, class501 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2987[0][arg0][arg1] = (short) arg2.method8195();
        if (var6) {
            int var8 = arg2.method8129();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method8195();
                if (var10 != 0) {
                    this.field2988[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method8129();
                    this.field2989[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2986[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method8129();
            if (var13 != 0) {
                class267[] var14 = this.field2991[var12][arg0][arg1] = new class267[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8148();
                    int var17 = arg2.method8129();
                    var14[var15] = new class267(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("kc.bc(I)I")
    public int method4966() {
        return this.field2993;
    }

    @ObfuscatedName("kc.bj(I)I")
    public int method4967() {
        return this.field2982;
    }

    @ObfuscatedName("kc.an(Ltz;S)V")
    public abstract void method4635(class501 arg0);
}
