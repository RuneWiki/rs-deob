package deob;

@ObfuscatedName("ld")
public class class319 extends class326 {

    @ObfuscatedName("ld.v")
    public final class367 field3827;

    @ObfuscatedName("ld.j")
    public int field3829 = 1;

    @ObfuscatedName("ld.l")
    public class299 field3830 = new class299();

    public class319(class367 arg0) {
        super(400);
        this.field3827 = arg0;
    }

    @ObfuscatedName("ld.s(B)Llm;")
    public class324 method5114() {
        return new class321();
    }

    @ObfuscatedName("ld.t(II)[Llm;")
    public class324[] method5113(int arg0) {
        return new class321[arg0];
    }

    @ObfuscatedName("ld.v(Loh;ZI)Z")
    public boolean method5130(class406 arg0, boolean arg1) {
        class321 var3 = (class321) this.method5224(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3865 != 0;
        }
    }

    @ObfuscatedName("ld.o(Lnv;II)V")
    public void method5127(class385 arg0, int arg1) {
        while (true) {
            if (arg0.field4182 < arg1) {
                boolean var3 = arg0.method5958() == 1;
                class406 var4 = new class406(arg0.method5967(), this.field3827);
                class406 var5 = new class406(arg0.method5967(), this.field3827);
                int var6 = arg0.method6053();
                int var7 = arg0.method5958();
                int var8 = arg0.method5958();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5967();
                    arg0.method5958();
                    arg0.method6182();
                }
                arg0.method5967();
                if (var4 != null && var4.method6522()) {
                    class321 var11 = (class321) this.method5225(var4);
                    if (var3) {
                        class321 var12 = (class321) this.method5225(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5228(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5235() >= 400) {
                            continue;
                        }
                        var11 = (class321) this.method5272(var4, var5);
                    } else {
                        this.method5233(var11, var4, var5);
                        if (var11.field3865 != var6) {
                            boolean var13 = true;
                            for (class322 var14 = (class322) this.field3830.method4830(); var14 != null; var14 = (class322) this.field3830.method4831()) {
                                if (var14.field3844.equals(var4)) {
                                    if (var6 != 0 && var14.field3846 == 0) {
                                        var14.method5442();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3846 != 0) {
                                        var14.method5442();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3830.method4828(new class322(var4, var6));
                            }
                        }
                    }
                    if (var11.field3865 != var6) {
                        var11.field3869 = ++this.field3829 - 1;
                        if (var11.field3865 == -1 && var6 == 0) {
                            var11.field3869 = -(var11.field3869 * 723168297) * -2065584103;
                        }
                        var11.field3865 = var6;
                    }
                    var11.field3866 = var7;
                    var11.field3843 = var9;
                    var11.field3842 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5232();
            return;
        }
    }
}
