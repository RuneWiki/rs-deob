package deob;

@ObfuscatedName("aw")
public abstract class class28 extends class90 {

    @ObfuscatedName("aw.aw")
    public int field648;

    @ObfuscatedName("aw.ay")
    public int field597;

    @ObfuscatedName("aw.as")
    public int field598;

    @ObfuscatedName("aw.ai")
    public boolean field599 = false;

    @ObfuscatedName("aw.aq")
    public int field600 = 1;

    @ObfuscatedName("aw.ac")
    public int field601 = -1;

    @ObfuscatedName("aw.ae")
    public int field602 = -1;

    @ObfuscatedName("aw.ag")
    public int field605 = -1;

    @ObfuscatedName("aw.am")
    public int field604 = -1;

    @ObfuscatedName("aw.af")
    public int field651 = -1;

    @ObfuscatedName("aw.ap")
    public int field606 = -1;

    @ObfuscatedName("aw.az")
    public int field607 = -1;

    @ObfuscatedName("aw.ab")
    public int field631 = -1;

    @ObfuscatedName("aw.ax")
    public String field603 = null;

    @ObfuscatedName("aw.ad")
    public boolean field610;

    @ObfuscatedName("aw.ah")
    public boolean field611 = false;

    @ObfuscatedName("aw.al")
    public int field608 = 100;

    @ObfuscatedName("aw.aa")
    public int field613 = 0;

    @ObfuscatedName("aw.an")
    public int field614 = 0;

    @ObfuscatedName("aw.au")
    public byte field615 = 0;

    @ObfuscatedName("aw.ak")
    public int[] field616 = new int[4];

    @ObfuscatedName("aw.ar")
    public int[] field620 = new int[4];

    @ObfuscatedName("aw.aj")
    public int[] field618 = new int[4];

    @ObfuscatedName("aw.ao")
    public int[] field619 = new int[4];

    @ObfuscatedName("aw.bn")
    public int[] field656 = new int[4];

    @ObfuscatedName("aw.bt")
    public class127 field612 = new class127();

    @ObfuscatedName("aw.bv")
    public int field642 = -1;

    @ObfuscatedName("aw.bd")
    public boolean field623 = false;

    @ObfuscatedName("aw.bm")
    public int field624 = -1;

    @ObfuscatedName("aw.bl")
    public int field625 = -1;

    @ObfuscatedName("aw.bo")
    public int field654 = 0;

    @ObfuscatedName("aw.by")
    public int field627 = 0;

    @ObfuscatedName("aw.br")
    public int field628 = -1;

    @ObfuscatedName("aw.bi")
    public int field621 = 0;

    @ObfuscatedName("aw.be")
    public int field596 = 0;

    @ObfuscatedName("aw.ba")
    public int field646 = 0;

    @ObfuscatedName("aw.bj")
    public int field632 = 0;

    @ObfuscatedName("aw.bu")
    public int field633 = -1;

    @ObfuscatedName("aw.bk")
    public int field634 = 0;

    @ObfuscatedName("aw.bh")
    public int field617 = 0;

    @ObfuscatedName("aw.bb")
    public int field609;

    @ObfuscatedName("aw.bg")
    public int field637;

    @ObfuscatedName("aw.bf")
    public int field638;

    @ObfuscatedName("aw.bp")
    public int field639;

    @ObfuscatedName("aw.bq")
    public int field640;

    @ObfuscatedName("aw.bs")
    public int field641;

    @ObfuscatedName("aw.bx")
    public int field649;

    @ObfuscatedName("aw.bc")
    public int field643;

    @ObfuscatedName("aw.bz")
    public int field644;

    @ObfuscatedName("aw.bw")
    public int field645 = 0;

    @ObfuscatedName("aw.ck")
    public int field622 = 200;

    @ObfuscatedName("aw.cd")
    public int field647;

    @ObfuscatedName("aw.cg")
    public int field636 = 0;

    @ObfuscatedName("aw.cw")
    public int field630 = 32;

    @ObfuscatedName("aw.ca")
    public int field650 = 0;

    @ObfuscatedName("aw.cc")
    public int[] field629 = new int[10];

    @ObfuscatedName("aw.cs")
    public int[] field652 = new int[10];

    @ObfuscatedName("aw.cy")
    public byte[] field626 = new byte[10];

    @ObfuscatedName("aw.cp")
    public int field635 = 0;

    @ObfuscatedName("aw.cu")
    public int field655 = 0;

    @ObfuscatedName("aw.ae(B)V")
    public final void method618() {
        this.field650 = 0;
        this.field655 = 0;
    }

    @ObfuscatedName("aw.c(I)Z")
    public boolean method237() {
        return false;
    }

    @ObfuscatedName("aw.ag(IIIIIII)V")
    public final void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field618[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class197 var13 = class197.method93(arg0);
            var11 = var13.field2885;
            var12 = var13.field2868;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field618[0];
            } else if (var11 == 1) {
                var14 = this.field620[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field618[var15] < var14) {
                        var10 = var15;
                        var14 = this.field618[var15];
                    }
                } else if (var11 == 1 && this.field620[var15] < var14) {
                    var10 = var15;
                    var14 = this.field620[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field615 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field615;
                this.field615 = (byte) ((this.field615 + 1) % 4);
                if (this.field618[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field616[var10] = arg0;
        this.field620[var10] = arg1;
        this.field619[var10] = arg2;
        this.field656[var10] = arg3;
        this.field618[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("aw.am(IIIIIII)V")
    public final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = (class194) class194.field2834.method2221((long) arg0);
        class194 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field2844.method3093(33, arg0);
            class194 var10 = new class194();
            if (var9 != null) {
                var10.method3335(new class161(var9));
            }
            class194.field2834.method2219(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class194 var11 = var8;
        class35 var12 = null;
        class35 var13 = null;
        int var14 = var8.field2841;
        int var15 = 0;
        for (class35 var16 = (class35) this.field612.method2252(); var16 != null; var16 = (class35) this.field612.method2244()) {
            var15++;
            if (var16.field745.field2836 == var11.field2836) {
                var16.method709(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field745.field2839 <= var11.field2839) {
                var12 = var16;
            }
            if (var16.field745.field2841 > var14) {
                var13 = var16;
                var14 = var16.field745.field2841;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class35 var17 = new class35(var11);
        if (var12 == null) {
            this.field612.method2258(var17);
        } else {
            class127.method2247(var17, var12);
        }
        var17.method709(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method2273();
        }
    }

    @ObfuscatedName("aw.af(II)V")
    public final void method620(int arg0) {
        class194 var2 = (class194) class194.field2834.method2221((long) arg0);
        class194 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2844.method3093(33, arg0);
            class194 var5 = new class194();
            if (var4 != null) {
                var5.method3335(new class161(var4));
            }
            class194.field2834.method2219(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class194 var6 = var3;
        for (class35 var7 = (class35) this.field612.method2252(); var7 != null; var7 = (class35) this.field612.method2244()) {
            if (var7.field745 == var6) {
                var7.method2273();
                return;
            }
        }
    }
}
