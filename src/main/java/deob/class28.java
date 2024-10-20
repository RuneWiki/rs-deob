package deob;

@ObfuscatedName("am")
public abstract class class28 extends class90 {

    @ObfuscatedName("am.am")
    public int field622;

    @ObfuscatedName("am.ad")
    public int field639;

    @ObfuscatedName("am.ah")
    public int field626;

    @ObfuscatedName("am.aj")
    public boolean field638 = false;

    @ObfuscatedName("am.ax")
    public int field597 = 1;

    @ObfuscatedName("am.ak")
    public int field598 = -1;

    @ObfuscatedName("am.ar")
    public int field599 = -1;

    @ObfuscatedName("am.aw")
    public int field600 = -1;

    @ObfuscatedName("am.ay")
    public int field601 = -1;

    @ObfuscatedName("am.af")
    public int field602 = -1;

    @ObfuscatedName("am.av")
    public int field603 = -1;

    @ObfuscatedName("am.aa")
    public int field604 = -1;

    @ObfuscatedName("am.ag")
    public int field605 = -1;

    @ObfuscatedName("am.ao")
    public String field606 = null;

    @ObfuscatedName("am.ab")
    public boolean field607;

    @ObfuscatedName("am.an")
    public boolean field608 = false;

    @ObfuscatedName("am.ac")
    public int field609 = 100;

    @ObfuscatedName("am.al")
    public int field595 = 0;

    @ObfuscatedName("am.ae")
    public int field610 = 0;

    @ObfuscatedName("am.au")
    public byte field612 = 0;

    @ObfuscatedName("am.aq")
    public int[] field651 = new int[4];

    @ObfuscatedName("am.at")
    public int[] field614 = new int[4];

    @ObfuscatedName("am.az")
    public int[] field613 = new int[4];

    @ObfuscatedName("am.as")
    public int[] field616 = new int[4];

    @ObfuscatedName("am.be")
    public int[] field617 = new int[4];

    @ObfuscatedName("am.bu")
    public class127 field596 = new class127();

    @ObfuscatedName("am.bo")
    public int field641 = -1;

    @ObfuscatedName("am.br")
    public boolean field620 = false;

    @ObfuscatedName("am.bb")
    public int field621 = -1;

    @ObfuscatedName("am.bl")
    public int field618 = -1;

    @ObfuscatedName("am.bm")
    public int field623 = 0;

    @ObfuscatedName("am.bf")
    public int field624 = 0;

    @ObfuscatedName("am.bg")
    public int field625 = -1;

    @ObfuscatedName("am.bp")
    public int field615 = 0;

    @ObfuscatedName("am.bj")
    public int field627 = 0;

    @ObfuscatedName("am.bx")
    public int field633 = 0;

    @ObfuscatedName("am.bn")
    public int field649 = 0;

    @ObfuscatedName("am.ba")
    public int field629 = -1;

    @ObfuscatedName("am.bi")
    public int field631 = 0;

    @ObfuscatedName("am.bc")
    public int field632 = 0;

    @ObfuscatedName("am.bs")
    public int field619;

    @ObfuscatedName("am.bw")
    public int field634;

    @ObfuscatedName("am.bv")
    public int field635;

    @ObfuscatedName("am.bt")
    public int field611;

    @ObfuscatedName("am.bq")
    public int field637;

    @ObfuscatedName("am.bk")
    public int field648;

    @ObfuscatedName("am.bh")
    public int field653;

    @ObfuscatedName("am.by")
    public int field640;

    @ObfuscatedName("am.bz")
    public int field593;

    @ObfuscatedName("am.bd")
    public int field642 = 0;

    @ObfuscatedName("am.cl")
    public int field643 = 200;

    @ObfuscatedName("am.cf")
    public int field644;

    @ObfuscatedName("am.co")
    public int field645 = 0;

    @ObfuscatedName("am.cq")
    public int field646 = 32;

    @ObfuscatedName("am.cw")
    public int field647 = 0;

    @ObfuscatedName("am.ci")
    public int[] field636 = new int[10];

    @ObfuscatedName("am.cm")
    public int[] field630 = new int[10];

    @ObfuscatedName("am.cc")
    public byte[] field650 = new byte[10];

    @ObfuscatedName("am.cd")
    public int field628 = 0;

    @ObfuscatedName("am.cb")
    public int field652 = 0;

    @ObfuscatedName("am.ax(B)V")
    public final void method581() {
        this.field647 = 0;
        this.field652 = 0;
    }

    @ObfuscatedName("am.j(B)Z")
    public boolean method227() {
        return false;
    }

    @ObfuscatedName("am.ak(IIIIIIB)V")
    public final void method591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field613[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class197 var13 = class197.method1908(arg0);
            var11 = var13.field2886;
            var12 = var13.field2870;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field613[0];
            } else if (var11 == 1) {
                var14 = this.field614[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field613[var15] < var14) {
                        var10 = var15;
                        var14 = this.field613[var15];
                    }
                } else if (var11 == 1 && this.field614[var15] < var14) {
                    var10 = var15;
                    var14 = this.field614[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field612 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field612;
                this.field612 = (byte) ((this.field612 + 1) % 4);
                if (this.field613[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field651[var10] = arg0;
        this.field614[var10] = arg1;
        this.field616[var10] = arg2;
        this.field617[var10] = arg3;
        this.field613[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("am.ar(IIIIIII)V")
    public final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = Statics.method2501(arg0);
        class35 var8 = null;
        class35 var9 = null;
        int var10 = var7.field2838;
        int var11 = 0;
        for (class35 var12 = (class35) this.field596.method2206(); var12 != null; var12 = (class35) this.field596.method2214()) {
            var11++;
            if (var12.field745.field2832 == var7.field2832) {
                var12.method680(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field745.field2833 <= var7.field2833) {
                var8 = var12;
            }
            if (var12.field745.field2838 > var10) {
                var9 = var12;
                var10 = var12.field745.field2838;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class35 var13 = new class35(var7);
        if (var8 == null) {
            this.field596.method2209(var13);
        } else {
            class127.method2205(var13, var8);
        }
        var13.method680(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method2225();
        }
    }

    @ObfuscatedName("am.aw(II)V")
    public final void method583(int arg0) {
        class194 var2 = Statics.method2501(arg0);
        for (class35 var3 = (class35) this.field596.method2206(); var3 != null; var3 = (class35) this.field596.method2214()) {
            if (var3.field745 == var2) {
                var3.method2225();
                return;
            }
        }
    }
}
