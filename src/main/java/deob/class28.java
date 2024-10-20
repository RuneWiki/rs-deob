package deob;

@ObfuscatedName("ac")
public abstract class class28 extends class90 {

    @ObfuscatedName("ac.ac")
    public int field636;

    @ObfuscatedName("ac.au")
    public int field605;

    @ObfuscatedName("ac.al")
    public int field606;

    @ObfuscatedName("ac.ae")
    public boolean field656 = false;

    @ObfuscatedName("ac.ad")
    public int field608 = 1;

    @ObfuscatedName("ac.aq")
    public int field609 = -1;

    @ObfuscatedName("ac.aa")
    public int field611 = -1;

    @ObfuscatedName("ac.af")
    public int field622 = -1;

    @ObfuscatedName("ac.as")
    public int field633 = -1;

    @ObfuscatedName("ac.ao")
    public int field613 = -1;

    @ObfuscatedName("ac.ax")
    public int field604 = -1;

    @ObfuscatedName("ac.an")
    public int field615 = -1;

    @ObfuscatedName("ac.ag")
    public int field616 = -1;

    @ObfuscatedName("ac.aj")
    public String field652 = null;

    @ObfuscatedName("ac.ar")
    public boolean field614;

    @ObfuscatedName("ac.az")
    public boolean field619 = false;

    @ObfuscatedName("ac.av")
    public int field638 = 100;

    @ObfuscatedName("ac.ap")
    public int field621 = 0;

    @ObfuscatedName("ac.aw")
    public int field642 = 0;

    @ObfuscatedName("ac.ai")
    public byte field618 = 0;

    @ObfuscatedName("ac.at")
    public int[] field624 = new int[4];

    @ObfuscatedName("ac.ah")
    public int[] field625 = new int[4];

    @ObfuscatedName("ac.am")
    public int[] field626 = new int[4];

    @ObfuscatedName("ac.ak")
    public int[] field612 = new int[4];

    @ObfuscatedName("ac.by")
    public int[] field628 = new int[4];

    @ObfuscatedName("ac.bf")
    public class127 field629 = new class127();

    @ObfuscatedName("ac.bj")
    public int field620 = -1;

    @ObfuscatedName("ac.bi")
    public boolean field631 = false;

    @ObfuscatedName("ac.br")
    public int field632 = -1;

    @ObfuscatedName("ac.bn")
    public int field650 = -1;

    @ObfuscatedName("ac.bx")
    public int field634 = 0;

    @ObfuscatedName("ac.bl")
    public int field635 = 0;

    @ObfuscatedName("ac.be")
    public int field641 = -1;

    @ObfuscatedName("ac.bv")
    public int field637 = 0;

    @ObfuscatedName("ac.bu")
    public int field630 = 0;

    @ObfuscatedName("ac.bb")
    public int field639 = 0;

    @ObfuscatedName("ac.bz")
    public int field640 = 0;

    @ObfuscatedName("ac.bm")
    public int field653 = -1;

    @ObfuscatedName("ac.ba")
    public int field649 = 0;

    @ObfuscatedName("ac.bk")
    public int field643 = 0;

    @ObfuscatedName("ac.bs")
    public int field644;

    @ObfuscatedName("ac.bg")
    public int field617;

    @ObfuscatedName("ac.bw")
    public int field646;

    @ObfuscatedName("ac.bt")
    public int field647;

    @ObfuscatedName("ac.bo")
    public int field648;

    @ObfuscatedName("ac.bp")
    public int field607;

    @ObfuscatedName("ac.bh")
    public int field645;

    @ObfuscatedName("ac.bq")
    public int field651;

    @ObfuscatedName("ac.bc")
    public int field627;

    @ObfuscatedName("ac.bd")
    public int field623 = 0;

    @ObfuscatedName("ac.cw")
    public int field654 = 200;

    @ObfuscatedName("ac.ci")
    public int field655;

    @ObfuscatedName("ac.ck")
    public int field661 = 0;

    @ObfuscatedName("ac.cn")
    public int field657 = 32;

    @ObfuscatedName("ac.cj")
    public int field658 = 0;

    @ObfuscatedName("ac.co")
    public int[] field659 = new int[10];

    @ObfuscatedName("ac.cm")
    public int[] field660 = new int[10];

    @ObfuscatedName("ac.ca")
    public byte[] field610 = new byte[10];

    @ObfuscatedName("ac.cp")
    public int field662 = 0;

    @ObfuscatedName("ac.cc")
    public int field663 = 0;

    @ObfuscatedName("ac.ae(S)V")
    public final void method636() {
        this.field658 = 0;
        this.field663 = 0;
    }

    @ObfuscatedName("ac.j(I)Z")
    public boolean method250() {
        return false;
    }

    @ObfuscatedName("ac.ad(IIIIIII)V")
    public final void method623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field626[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class197 var13 = class197.method952(arg0);
            var11 = var13.field2892;
            var12 = var13.field2883;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field626[0];
            } else if (var11 == 1) {
                var14 = this.field625[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field626[var15] < var14) {
                        var10 = var15;
                        var14 = this.field626[var15];
                    }
                } else if (var11 == 1 && this.field625[var15] < var14) {
                    var10 = var15;
                    var14 = this.field625[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field618 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field618;
                this.field618 = (byte) ((this.field618 + 1) % 4);
                if (this.field626[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field624[var10] = arg0;
        this.field625[var10] = arg1;
        this.field612[var10] = arg2;
        this.field628[var10] = arg3;
        this.field626[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ac.aq(IIIIIII)V")
    public final void method622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = (class194) class194.field2837.method2275((long) arg0);
        class194 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field2847.method3153(33, arg0);
            class194 var10 = new class194();
            if (var9 != null) {
                var10.method3379(new class154(var9));
            }
            class194.field2837.method2282(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class194 var11 = var8;
        class35 var12 = null;
        class35 var13 = null;
        int var14 = var8.field2842;
        int var15 = 0;
        for (class35 var16 = (class35) this.field629.method2302(); var16 != null; var16 = (class35) this.field629.method2317()) {
            var15++;
            if (var16.field762.field2839 == var11.field2839) {
                var16.method782(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field762.field2841 <= var11.field2841) {
                var12 = var16;
            }
            if (var16.field762.field2842 > var14) {
                var13 = var16;
                var14 = var16.field762.field2842;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class35 var17 = new class35(var11);
        if (var12 == null) {
            this.field629.method2304(var17);
        } else {
            class127.method2305(var17, var12);
        }
        var17.method782(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method2327();
        }
    }

    @ObfuscatedName("ac.aa(IB)V")
    public final void method625(int arg0) {
        class194 var2 = (class194) class194.field2837.method2275((long) arg0);
        class194 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2847.method3153(33, arg0);
            class194 var5 = new class194();
            if (var4 != null) {
                var5.method3379(new class154(var4));
            }
            class194.field2837.method2282(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class194 var6 = var3;
        for (class35 var7 = (class35) this.field629.method2302(); var7 != null; var7 = (class35) this.field629.method2317()) {
            if (var7.field762 == var6) {
                var7.method2327();
                return;
            }
        }
    }
}
