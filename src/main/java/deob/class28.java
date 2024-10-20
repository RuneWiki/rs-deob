package deob;

@ObfuscatedName("aq")
public abstract class class28 extends class90 {

    @ObfuscatedName("aq.aq")
    public int field619;

    @ObfuscatedName("aq.aw")
    public int field609;

    @ObfuscatedName("aq.as")
    public int field596;

    @ObfuscatedName("aq.ah")
    public boolean field594 = false;

    @ObfuscatedName("aq.aa")
    public int field598 = 1;

    @ObfuscatedName("aq.ai")
    public int field652 = -1;

    @ObfuscatedName("aq.af")
    public int field597 = -1;

    @ObfuscatedName("aq.aj")
    public int field643 = -1;

    @ObfuscatedName("aq.am")
    public int field599 = -1;

    @ObfuscatedName("aq.ar")
    public int field600 = -1;

    @ObfuscatedName("aq.ad")
    public int field601 = -1;

    @ObfuscatedName("aq.ay")
    public int field602 = -1;

    @ObfuscatedName("aq.ao")
    public int field603 = -1;

    @ObfuscatedName("aq.ac")
    public String field604 = null;

    @ObfuscatedName("aq.ag")
    public boolean field605;

    @ObfuscatedName("aq.at")
    public boolean field647 = false;

    @ObfuscatedName("aq.au")
    public int field607 = 100;

    @ObfuscatedName("aq.ax")
    public int field608 = 0;

    @ObfuscatedName("aq.ae")
    public int field649 = 0;

    @ObfuscatedName("aq.al")
    public byte field610 = 0;

    @ObfuscatedName("aq.az")
    public int[] field611 = new int[4];

    @ObfuscatedName("aq.av")
    public int[] field612 = new int[4];

    @ObfuscatedName("aq.ak")
    public int[] field613 = new int[4];

    @ObfuscatedName("aq.an")
    public int[] field614 = new int[4];

    @ObfuscatedName("aq.bb")
    public int[] field615 = new int[4];

    @ObfuscatedName("aq.bm")
    public class127 field616 = new class127();

    @ObfuscatedName("aq.bz")
    public int field627 = -1;

    @ObfuscatedName("aq.bl")
    public boolean field618 = false;

    @ObfuscatedName("aq.bh")
    public int field636 = -1;

    @ObfuscatedName("aq.bc")
    public int field620 = -1;

    @ObfuscatedName("aq.bx")
    public int field621 = 0;

    @ObfuscatedName("aq.bi")
    public int field622 = 0;

    @ObfuscatedName("aq.bf")
    public int field623 = -1;

    @ObfuscatedName("aq.bk")
    public int field624 = 0;

    @ObfuscatedName("aq.bd")
    public int field625 = 0;

    @ObfuscatedName("aq.bp")
    public int field626 = 0;

    @ObfuscatedName("aq.br")
    public int field591 = 0;

    @ObfuscatedName("aq.be")
    public int field628 = -1;

    @ObfuscatedName("aq.bw")
    public int field648 = 0;

    @ObfuscatedName("aq.bj")
    public int field630 = 0;

    @ObfuscatedName("aq.bs")
    public int field631;

    @ObfuscatedName("aq.ba")
    public int field632;

    @ObfuscatedName("aq.bn")
    public int field633;

    @ObfuscatedName("aq.bv")
    public int field634;

    @ObfuscatedName("aq.bt")
    public int field635;

    @ObfuscatedName("aq.bu")
    public int field606;

    @ObfuscatedName("aq.by")
    public int field637;

    @ObfuscatedName("aq.bo")
    public int field638;

    @ObfuscatedName("aq.bg")
    public int field617;

    @ObfuscatedName("aq.bq")
    public int field640 = 0;

    @ObfuscatedName("aq.ci")
    public int field593 = 200;

    @ObfuscatedName("aq.ch")
    public int field642;

    @ObfuscatedName("aq.cf")
    public int field592 = 0;

    @ObfuscatedName("aq.ct")
    public int field644 = 32;

    @ObfuscatedName("aq.cu")
    public int field645 = 0;

    @ObfuscatedName("aq.ck")
    public int[] field629 = new int[10];

    @ObfuscatedName("aq.cy")
    public int[] field641 = new int[10];

    @ObfuscatedName("aq.cn")
    public byte[] field595 = new byte[10];

    @ObfuscatedName("aq.co")
    public int field639 = 0;

    @ObfuscatedName("aq.ca")
    public int field646 = 0;

    @ObfuscatedName("aq.ah(B)V")
    public final void method635() {
        this.field645 = 0;
        this.field646 = 0;
    }

    @ObfuscatedName("aq.c(I)Z")
    public boolean method242() {
        return false;
    }

    @ObfuscatedName("aq.aa(IIIIIII)V")
    public final void method627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
            class197 var13 = class197.method2653(arg0);
            var11 = var13.field2868;
            var12 = var13.field2859;
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
                var14 = this.field612[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field613[var15] < var14) {
                        var10 = var15;
                        var14 = this.field613[var15];
                    }
                } else if (var11 == 1 && this.field612[var15] < var14) {
                    var10 = var15;
                    var14 = this.field612[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field610 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field610;
                this.field610 = (byte) ((this.field610 + 1) % 4);
                if (this.field613[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field611[var10] = arg0;
        this.field612[var10] = arg1;
        this.field614[var10] = arg2;
        this.field615[var10] = arg3;
        this.field613[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("aq.ai(IIIIIII)V")
    public final void method625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = class194.method232(arg0);
        class35 var8 = null;
        class35 var9 = null;
        int var10 = var7.field2819;
        int var11 = 0;
        for (class35 var12 = (class35) this.field616.method2191(); var12 != null; var12 = (class35) this.field616.method2193()) {
            var11++;
            if (var12.field752.field2818 == var7.field2818) {
                var12.method722(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field752.field2821 <= var7.field2821) {
                var8 = var12;
            }
            if (var12.field752.field2819 > var10) {
                var9 = var12;
                var10 = var12.field752.field2819;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class35 var13 = new class35(var7);
        if (var8 == null) {
            this.field616.method2188(var13);
        } else {
            class127.method2190(var13, var8);
        }
        var13.method722(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method2214();
        }
    }

    @ObfuscatedName("aq.af(II)V")
    public final void method628(int arg0) {
        class194 var2 = class194.method232(arg0);
        for (class35 var3 = (class35) this.field616.method2191(); var3 != null; var3 = (class35) this.field616.method2193()) {
            if (var3.field752 == var2) {
                var3.method2214();
                return;
            }
        }
    }
}
