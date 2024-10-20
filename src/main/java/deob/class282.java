package deob;

import java.util.LinkedList;

@ObfuscatedName("kl")
public abstract class class282 {

    @ObfuscatedName("kl.an")
    public int field3103;

    @ObfuscatedName("kl.ao")
    public int field3104;

    @ObfuscatedName("kl.ab")
    public int field3093;

    @ObfuscatedName("kl.aw")
    public int field3094;

    @ObfuscatedName("kl.ad")
    public int field3095;

    @ObfuscatedName("kl.al")
    public int field3096;

    @ObfuscatedName("kl.as")
    public int field3100 = -1;

    @ObfuscatedName("kl.ag")
    public int field3091 = -1;

    @ObfuscatedName("kl.ai")
    public short[][][] field3099;

    @ObfuscatedName("kl.ax")
    public short[][][] field3092;

    @ObfuscatedName("kl.ar")
    public byte[][][] field3101;

    @ObfuscatedName("kl.aj")
    public byte[][][] field3102;

    @ObfuscatedName("kl.au")
    public class284[][][][] field3097;

    @ObfuscatedName("kl.ay")
    public boolean field3098;

    @ObfuscatedName("kl.ap")
    public boolean field3105;

    public class282() {
        new LinkedList();
        this.field3098 = false;
        this.field3105 = false;
    }

    @ObfuscatedName("kl.aa(B)Z")
    public boolean method5187() {
        return this.field3098 && this.field3105;
    }

    @ObfuscatedName("kl.aq(Loc;I)V")
    public void method5190(class379 arg0) {
        if (this.method5187()) {
            return;
        }
        byte[] var2 = arg0.method6328(this.field3100, this.field3091);
        if (var2 != null) {
            this.method4815(new class535(var2));
            this.field3098 = true;
            this.field3105 = true;
        }
    }

    @ObfuscatedName("kl.am(I)V")
    public void method5175() {
        this.field3099 = (short[][][]) null;
        this.field3092 = (short[][][]) null;
        this.field3101 = (byte[][][]) null;
        this.field3102 = (byte[][][]) null;
        this.field3097 = (class284[][][][]) null;
        this.field3098 = false;
        this.field3105 = false;
    }

    @ObfuscatedName("kl.ac(IILur;I)V")
    public void method5176(int arg0, int arg1, class535 arg2) {
        int var4 = arg2.method8462();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method5184(arg0, arg1, arg2, var4);
        } else {
            this.method5177(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("kl.ae(IILur;II)V")
    public void method5177(int arg0, int arg1, class535 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field3092[0][arg0][arg1] = (short) arg2.method8670();
        }
        this.field3099[0][arg0][arg1] = (short) arg2.method8670();
    }

    @ObfuscatedName("kl.ak(IILur;IB)V")
    public void method5184(int arg0, int arg1, class535 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field3099[0][arg0][arg1] = (short) arg2.method8670();
        if (var6) {
            int var8 = arg2.method8462();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method8670();
                if (var10 != 0) {
                    this.field3092[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method8462();
                    this.field3101[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field3102[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method8462();
            if (var13 != 0) {
                class284[] var14 = this.field3097[var12][arg0][arg1] = new class284[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8633();
                    int var17 = arg2.method8462();
                    var14[var15] = new class284(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("kl.bp(I)I")
    public int method5179() {
        return this.field3093;
    }

    @ObfuscatedName("kl.bz(I)I")
    public int method5180() {
        return this.field3094;
    }

    @ObfuscatedName("kl.ah(Lur;B)V")
    public abstract void method4815(class535 arg0);
}
