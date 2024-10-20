package deob;

import java.util.LinkedList;

@ObfuscatedName("km")
public abstract class class267 {

    @ObfuscatedName("km.as")
    public int field2986;

    @ObfuscatedName("km.aj")
    public int field2983;

    @ObfuscatedName("km.ag")
    public int field2984;

    @ObfuscatedName("km.az")
    public int field2989;

    @ObfuscatedName("km.av")
    public int field2992;

    @ObfuscatedName("km.ap")
    public int field2987;

    @ObfuscatedName("km.aq")
    public int field2988 = -1;

    @ObfuscatedName("km.at")
    public int field2985 = -1;

    @ObfuscatedName("km.ah")
    public short[][][] field2990;

    @ObfuscatedName("km.ax")
    public short[][][] field2991;

    @ObfuscatedName("km.aa")
    public byte[][][] field2982;

    @ObfuscatedName("km.au")
    public byte[][][] field2993;

    @ObfuscatedName("km.ae")
    public class269[][][][] field2994;

    @ObfuscatedName("km.ab")
    public boolean field2995;

    @ObfuscatedName("km.ad")
    public boolean field2996;

    public class267() {
        new LinkedList();
        this.field2995 = false;
        this.field2996 = false;
    }

    @ObfuscatedName("km.ac(B)Z")
    public boolean method4991() {
        return this.field2995 && this.field2996;
    }

    @ObfuscatedName("km.ak(Lnd;I)V")
    public void method4992(class360 arg0) {
        if (this.method4991()) {
            return;
        }
        byte[] var2 = arg0.method6117(this.field2988, this.field2985);
        if (var2 != null) {
            this.method4660(new class514(var2));
            this.field2995 = true;
            this.field2996 = true;
        }
    }

    @ObfuscatedName("km.an(B)V")
    public void method4993() {
        this.field2990 = (short[][][]) null;
        this.field2991 = (short[][][]) null;
        this.field2982 = (byte[][][]) null;
        this.field2993 = (byte[][][]) null;
        this.field2994 = (class269[][][][]) null;
        this.field2995 = false;
        this.field2996 = false;
    }

    @ObfuscatedName("km.af(IILty;B)V")
    public void method4990(int arg0, int arg1, class514 arg2) {
        int var4 = arg2.method8244();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4995(arg0, arg1, arg2, var4);
        } else {
            this.method4994(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("km.ai(IILty;IB)V")
    public void method4994(int arg0, int arg1, class514 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2991[0][arg0][arg1] = (short) arg2.method8246();
        }
        this.field2990[0][arg0][arg1] = (short) arg2.method8246();
    }

    @ObfuscatedName("km.al(IILty;IB)V")
    public void method4995(int arg0, int arg1, class514 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2990[0][arg0][arg1] = (short) arg2.method8246();
        if (var6) {
            int var8 = arg2.method8244();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method8246();
                if (var10 != 0) {
                    this.field2991[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method8244();
                    this.field2982[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2993[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method8244();
            if (var13 != 0) {
                class269[] var14 = this.field2994[var12][arg0][arg1] = new class269[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8310();
                    int var17 = arg2.method8244();
                    var14[var15] = new class269(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("km.bd(I)I")
    public int method4997() {
        return this.field2984;
    }

    @ObfuscatedName("km.bb(I)I")
    public int method4998() {
        return this.field2989;
    }

    @ObfuscatedName("km.ay(Lty;B)V")
    public abstract void method4660(class514 arg0);
}
