package deob;

import java.util.ArrayList;

@ObfuscatedName("qw")
public class class432 {

    @ObfuscatedName("qw.ax")
    public int field4736 = Integer.MAX_VALUE;

    @ObfuscatedName("qw.ay")
    public int field4727 = Integer.MAX_VALUE;

    @ObfuscatedName("qw.au")
    public int field4738 = 0;

    @ObfuscatedName("qw.as")
    public int field4739 = 0;

    @ObfuscatedName("qw.aw")
    public int field4740 = 0;

    @ObfuscatedName("qw.ad")
    public boolean field4741 = true;

    @ObfuscatedName("qw.ai")
    public class435 field4732;

    @ObfuscatedName("qw.an")
    public ArrayList field4743 = new ArrayList();

    @ObfuscatedName("qw.am")
    public int field4737 = 0;

    @ObfuscatedName("qw.ar")
    public int field4745 = 0;

    @ObfuscatedName("qw.ak(IB)Lqo;")
    public class434 method7321(int arg0) {
        return (class434) this.field4743.get(arg0);
    }

    @ObfuscatedName("qw.al(B)Lqo;")
    public class434 method7322() {
        return this.field4743.size() == 0 ? null : (class434) this.field4743.get(this.field4743.size() - 1);
    }

    @ObfuscatedName("qw.aj(I)Z")
    public boolean method7323() {
        return this.field4743.size() == 0;
    }

    @ObfuscatedName("qw.az(B)Z")
    public boolean method7324() {
        return this.field4727 > 1;
    }

    @ObfuscatedName("qw.af(I)I")
    public int method7376() {
        return this.field4743.size();
    }

    @ObfuscatedName("qw.aa(I)Ljava/lang/String;")
    public String method7326() {
        if (this.method7323()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7376());
        for (int var2 = 0; var2 < this.method7376(); var2++) {
            class434 var3 = this.method7321(var2);
            var1.append(var3.field4750);
        }
        return var1.toString();
    }

    @ObfuscatedName("qw.at(IB)V")
    public void method7327(int arg0) {
        if (this.field4732 != null && arg0 < this.field4732.field4760 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4736 != arg0) {
            this.field4736 = arg0;
            this.method7355();
        }
    }

    @ObfuscatedName("qw.ab(II)V")
    public void method7328(int arg0) {
        if (this.field4727 != arg0) {
            this.field4727 = arg0;
            this.method7355();
        }
    }

    @ObfuscatedName("qw.ac(II)V")
    public void method7329(int arg0) {
        if (this.field4745 != arg0) {
            this.field4745 = arg0;
            this.method7355();
        }
    }

    @ObfuscatedName("qw.ao(Lqt;I)V")
    public void method7330(class435 arg0) {
        if (this.field4732 == arg0) {
            return;
        }
        this.field4732 = arg0;
        if (this.field4732 == null) {
            return;
        }
        if (this.field4740 == 0) {
            this.field4740 = this.field4732.field4760;
        }
        if (!this.method7323()) {
            this.method7355();
        }
    }

    @ObfuscatedName("qw.ah(II)V")
    public void method7331(int arg0) {
        if (this.field4737 != arg0) {
            this.field4737 = arg0;
            this.method7355();
        }
    }

    @ObfuscatedName("qw.av(III)Z")
    public boolean method7332(int arg0, int arg1) {
        if (this.field4738 != arg0 || this.field4739 != arg1) {
            this.field4738 = arg0;
            this.field4739 = arg1;
            this.method7355();
        }
        return true;
    }

    @ObfuscatedName("qw.aq(IB)V")
    public void method7371(int arg0) {
        if (this.field4740 != arg0) {
            this.field4740 = arg0;
            this.method7355();
        }
    }

    @ObfuscatedName("qw.ap(III)Lqv;")
    public class436 method7334(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class436(this, 0, 0);
        } else if (arg0 <= this.field4743.size() && arg1 <= this.field4743.size()) {
            return arg1 < arg0 ? new class436(this, arg1, arg0) : new class436(this, arg0, arg1);
        } else {
            return new class436(this, 0, 0);
        }
    }

    @ObfuscatedName("qw.ae(CIII)Lqs;")
    public class433 method7421(char arg0, int arg1, int arg2) {
        return this.method7336(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("qw.ax(Ljava/lang/String;III)Lqs;")
    public class433 method7336(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4743.size() >= arg2) {
            this.method7356(arg1, arg1);
            return new class433(arg1, true);
        }
        this.field4743.ensureCapacity(this.field4743.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4743.size() < arg2; var5++) {
            class434 var6 = new class434();
            var6.field4750 = arg0.charAt(var5);
            this.field4743.add(var4, var6);
            var4++;
        }
        this.method7356(arg1, var4);
        if (this.field4727 == 0 || this.method7361() <= this.field4727) {
            return new class433(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method7391(var4);
            if (this.method7361() <= this.field4727) {
                break;
            }
        }
        return new class433(var4, true);
    }

    @ObfuscatedName("qw.ay(Ljava/lang/String;II)Lqs;")
    public class433 method7337(String arg0, int arg1) {
        return this.method7336(arg0, this.field4743.size(), arg1);
    }

    @ObfuscatedName("qw.au(Ljava/lang/String;B)Lqs;")
    public class433 method7370(String arg0) {
        this.method7339();
        return this.method7337(arg0, 0);
    }

    @ObfuscatedName("qw.as(I)V")
    public void method7339() {
        this.field4743.clear();
    }

    @ObfuscatedName("qw.aw(II)I")
    public int method7391(int arg0) {
        return this.method7341(arg0, arg0 + 1);
    }

    @ObfuscatedName("qw.ad(III)I")
    public int method7341(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4743.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method7324() && this.field4737 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class434) this.field4743.get(var4)).field4750;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method7356(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("qw.ai(III)I")
    public int method7342(int arg0, int arg1) {
        if (this.field4732 == null) {
            return 0;
        } else if (this.method7324() && arg0 > this.field4736) {
            return this.field4743.size();
        } else {
            if (!this.field4743.isEmpty()) {
                for (int var3 = 0; var3 < this.field4743.size(); var3++) {
                    class434 var4 = (class434) this.field4743.get(var3);
                    if (arg1 <= var4.field4752 + this.method7346()) {
                        if (arg1 < var4.field4752) {
                            break;
                        }
                        if (arg0 < var4.field4751) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4743.size() && ((class434) this.field4743.get(var3 + 1)).field4752 != var4.field4752) {
                            int var5 = this.method7358((class434) this.field4743.get(var3), false);
                            if (arg0 < var4.field4751 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4752 + this.method7346()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class434 var6 = (class434) this.field4743.get(this.field4743.size() - 1);
                if (arg0 >= var6.field4751 && arg0 <= var6.field4751 + this.method7407() && arg1 >= var6.field4752 && arg1 <= var6.field4752 + this.method7346()) {
                    return this.field4743.size() - 1;
                }
            }
            return this.field4743.size();
        }
    }

    @ObfuscatedName("qw.an(III)I")
    public int method7343(int arg0, int arg1) {
        if (this.field4732 == null || this.method7323() || arg0 > this.field4743.size()) {
            return 0;
        }
        byte var3;
        if (arg1 > 0) {
            var3 = 1;
        } else {
            var3 = -1;
            arg1 = -arg1;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 > 0) {
            class434 var6 = (class434) this.field4743.get(arg0 - 1);
            var4 = var6.field4751 + this.method7357(arg0 - 1);
            var5 = var6.field4752;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4743.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class434 var13 = (class434) this.field4743.get(var12 - 1);
            if (var13.field4752 != var5) {
                var8++;
                var5 = var13.field4752;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4751 + this.method7357(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4743.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("qw.am(B)I")
    public int method7344() {
        if (!this.field4743.isEmpty() && this.method7361() == 1) {
            return this.field4743.isEmpty() ? 0 : ((class434) this.field4743.get(this.field4743.size() - 1)).field4751 + this.method7407();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4743.size() - 1; var3 >= 0; var3--) {
            class434 var4 = (class434) this.field4743.get(var3);
            if (var4.field4752 != var1) {
                int var5 = this.method7358(var4, false) + var4.field4751;
                var2 = Math.max(var5, var2);
                var1 = var4.field4752;
            }
        }
        return var2;
    }

    @ObfuscatedName("qw.ar(I)I")
    public int method7401() {
        return this.method7323() ? 0 : this.field4732.field4760 + ((class434) this.field4743.get(this.field4743.size() - 1)).field4752;
    }

    @ObfuscatedName("qw.ag(I)I")
    public int method7346() {
        return this.field4740;
    }

    @ObfuscatedName("qw.bs(B)I")
    public int method7361() {
        return this.method7401() / this.field4732.field4760;
    }

    @ObfuscatedName("qw.bf(B)I")
    public int method7407() {
        return this.method7323() ? 0 : this.method7358((class434) this.field4743.get(this.field4743.size() - 1), false);
    }

    @ObfuscatedName("qw.bo(B)I")
    public int method7349() {
        return this.field4736;
    }

    @ObfuscatedName("qw.bi(I)I")
    public int method7350() {
        return this.field4727;
    }

    @ObfuscatedName("qw.bt(B)I")
    public int method7333() {
        return this.field4737;
    }

    @ObfuscatedName("qw.bn(I)I")
    public int method7352() {
        return this.field4745;
    }

    @ObfuscatedName("qw.bw(II)I")
    public int method7353(int arg0) {
        switch(this.field4738) {
            case 0:
                return 0;
            case 1:
                return arg0 / 2;
            case 2:
                return arg0;
            default:
                return 0;
        }
    }

    @ObfuscatedName("qw.bl(IS)I")
    public int method7354(int arg0) {
        switch(this.field4739) {
            case 0:
                return 0;
            case 1:
                return arg0 / 2;
            case 2:
                return arg0;
            default:
                return 0;
        }
    }

    @ObfuscatedName("qw.be(I)V")
    public void method7355() {
        this.method7356(0, this.field4743.size());
    }

    @ObfuscatedName("qw.bg(IIS)V")
    public void method7356(int arg0, int arg1) {
        if (this.method7323() || this.field4732 == null) {
            return;
        }
        class517 var3 = this.method7359(arg0, arg1);
        boolean var4 = (Integer) var3.field5200 == 0 && (Integer) var3.field5199 == this.field4743.size();
        int var5 = (Integer) var3.field5200;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class434) this.field4743.get((Integer) var3.field5200)).field4752;
        int var8 = 0;
        for (int var9 = (Integer) var3.field5200; var9 <= (Integer) var3.field5199; var9++) {
            boolean var10 = var9 >= this.field4743.size();
            class434 var11 = (class434) this.field4743.get(var10 ? this.field4743.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method7358(var11, false);
            boolean var13 = !var10 && var11.field4750 == '\n';
            boolean var14 = !var10 && this.method7324() && var6 + var12 > this.field4736;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4737 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class434 var19 = (class434) this.field4743.get(var18);
                            var17 += var18 < var15 ? this.method7358(var19, false) : 0;
                            if (var19.field4750 == ' ' || var19.field4750 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method7353(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class434 var22 = (class434) this.field4743.get(var21);
                    int var23 = this.method7358(var22, false);
                    var22.field4751 = var20;
                    var22.field4752 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method7346();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4739 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method7346();
        int var25 = this.method7354(var24);
        for (int var26 = 0; var26 < this.field4743.size(); var26++) {
            class434 var27 = (class434) this.field4743.get(var26);
            var27.field4752 -= var25;
        }
    }

    @ObfuscatedName("qw.bu(IB)I")
    public int method7357(int arg0) {
        return arg0 < this.field4743.size() ? this.method7358((class434) this.field4743.get(arg0), false) : 0;
    }

    @ObfuscatedName("qw.bh(Lqo;ZB)I")
    public int method7358(class434 arg0, boolean arg1) {
        if (arg0.field4750 == '\n') {
            return 0;
        } else if (arg1 || this.field4745 == 0) {
            int var3 = this.field4732.field4755[arg0.field4750];
            if (var3 == 0) {
                return arg0.field4750 == '\t' ? this.field4732.field4755[32] * 3 : this.field4732.field4755[32];
            } else {
                return var3;
            }
        } else {
            return this.field4732.field4755[42];
        }
    }

    @ObfuscatedName("qw.bk(IIB)Lto;")
    public class517 method7359(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4743.size();
        if (var3 == 0 && var4 == var5) {
            return new class517(0, var5);
        }
        int var6 = this.method7360(var3, false);
        int var7 = this.method7425(var4, false);
        switch(this.field4739) {
            case 0:
                if (this.field4738 == 0) {
                    return new class517(var6, var5);
                }
                int var9 = this.method7360(var3, true);
                return new class517(var9, var5);
            case 1:
                return new class517(0, var5);
            case 2:
                if (this.field4738 == 2) {
                    return new class517(0, var7);
                }
                int var8 = this.method7425(var4, true);
                return new class517(0, var8);
            default:
                return new class517(0, var5);
        }
    }

    @ObfuscatedName("qw.bp(IZI)I")
    public int method7360(int arg0, boolean arg1) {
        if (arg0 < this.field4743.size()) {
            int var3 = ((class434) this.field4743.get(arg0)).field4752;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class434) this.field4743.get(var4 - 1)).field4752 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class434) this.field4743.get(var4 - 1)).field4752;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("qw.br(IZI)I")
    public int method7425(int arg0, boolean arg1) {
        if (arg0 < this.field4743.size()) {
            int var3 = ((class434) this.field4743.get(arg0)).field4752;
            for (int var4 = arg0; var4 < this.field4743.size() - 1; var4++) {
                if (((class434) this.field4743.get(var4 + 1)).field4752 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class434) this.field4743.get(var4 + 1)).field4752;
                }
            }
        }
        return this.field4743.size();
    }
}
