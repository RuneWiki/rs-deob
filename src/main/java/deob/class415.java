package deob;

import java.util.ArrayList;

@ObfuscatedName("pl")
public class class415 {

    @ObfuscatedName("pl.aj")
    public int field4595 = Integer.MAX_VALUE;

    @ObfuscatedName("pl.au")
    public int field4596 = Integer.MAX_VALUE;

    @ObfuscatedName("pl.ay")
    public int field4598 = 0;

    @ObfuscatedName("pl.ap")
    public int field4589 = 0;

    @ObfuscatedName("pl.av")
    public int field4599 = 0;

    @ObfuscatedName("pl.aa")
    public boolean field4600 = true;

    @ObfuscatedName("pl.aq")
    public class418 field4603;

    @ObfuscatedName("pl.am")
    public ArrayList field4602 = new ArrayList();

    @ObfuscatedName("pl.ac")
    public int field4590 = 0;

    @ObfuscatedName("pl.ae")
    public int field4604 = 0;

    @ObfuscatedName("pl.az(II)Lqt;")
    public class417 method6867(int arg0) {
        return (class417) this.field4602.get(arg0);
    }

    @ObfuscatedName("pl.ah(I)Lqt;")
    public class417 method6894() {
        return this.field4602.size() == 0 ? null : (class417) this.field4602.get(this.field4602.size() - 1);
    }

    @ObfuscatedName("pl.af(I)Z")
    public boolean method6924() {
        return this.field4602.size() == 0;
    }

    @ObfuscatedName("pl.at(I)Z")
    public boolean method6870() {
        return this.field4596 > 1;
    }

    @ObfuscatedName("pl.an(I)I")
    public int method6871() {
        return this.field4602.size();
    }

    @ObfuscatedName("pl.ao(I)Ljava/lang/String;")
    public String method6897() {
        if (this.method6924()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6871());
        for (int var2 = 0; var2 < this.method6871(); var2++) {
            class417 var3 = this.method6867(var2);
            var1.append(var3.field4608);
        }
        return var1.toString();
    }

    @ObfuscatedName("pl.ab(II)V")
    public void method6873(int arg0) {
        if (this.field4603 != null && arg0 < this.field4603.field4617 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4595 != arg0) {
            this.field4595 = arg0;
            this.method6967();
        }
    }

    @ObfuscatedName("pl.aw(II)V")
    public void method6918(int arg0) {
        if (this.field4596 != arg0) {
            this.field4596 = arg0;
            this.method6967();
        }
    }

    @ObfuscatedName("pl.ad(IB)V")
    public void method6976(int arg0) {
        if (this.field4604 != arg0) {
            this.field4604 = arg0;
            this.method6967();
        }
    }

    @ObfuscatedName("pl.al(Lqu;I)V")
    public void method6876(class418 arg0) {
        if (this.field4603 == arg0) {
            return;
        }
        this.field4603 = arg0;
        if (this.field4603 == null) {
            return;
        }
        if (this.field4599 == 0) {
            this.field4599 = this.field4603.field4617;
        }
        if (!this.method6924()) {
            this.method6967();
        }
    }

    @ObfuscatedName("pl.as(II)V")
    public void method6877(int arg0) {
        if (this.field4590 != arg0) {
            this.field4590 = arg0;
            this.method6967();
        }
    }

    @ObfuscatedName("pl.ag(III)Z")
    public boolean method6878(int arg0, int arg1) {
        if (this.field4598 != arg0 || this.field4589 != arg1) {
            this.field4598 = arg0;
            this.field4589 = arg1;
            this.method6967();
        }
        return true;
    }

    @ObfuscatedName("pl.ai(IB)V")
    public void method6872(int arg0) {
        if (this.field4599 != arg0) {
            this.field4599 = arg0;
            this.method6967();
        }
    }

    @ObfuscatedName("pl.ax(IIB)Lqs;")
    public class419 method6880(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class419(this, 0, 0);
        } else if (arg0 <= this.field4602.size() && arg1 <= this.field4602.size()) {
            return arg1 < arg0 ? new class419(this, arg1, arg0) : new class419(this, arg0, arg1);
        } else {
            return new class419(this, 0, 0);
        }
    }

    @ObfuscatedName("pl.ar(CIII)Lpf;")
    public class416 method6881(char arg0, int arg1, int arg2) {
        return this.method6882(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("pl.aj(Ljava/lang/String;IIB)Lpf;")
    public class416 method6882(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4602.size() >= arg2) {
            this.method6901(arg1, arg1);
            return new class416(arg1, true);
        }
        this.field4602.ensureCapacity(this.field4602.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4602.size() < arg2; var5++) {
            class417 var6 = new class417();
            var6.field4608 = arg0.charAt(var5);
            this.field4602.add(var4, var6);
            var4++;
        }
        this.method6901(arg1, var4);
        if (this.field4596 == 0 || this.method6893() <= this.field4596) {
            return new class416(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method6937(var4);
            if (this.method6893() <= this.field4596) {
                break;
            }
        }
        return new class416(var4, true);
    }

    @ObfuscatedName("pl.au(Ljava/lang/String;II)Lpf;")
    public class416 method6883(String arg0, int arg1) {
        return this.method6882(arg0, this.field4602.size(), arg1);
    }

    @ObfuscatedName("pl.ay(Ljava/lang/String;B)Lpf;")
    public class416 method6889(String arg0) {
        this.method6920();
        return this.method6883(arg0, 0);
    }

    @ObfuscatedName("pl.ap(I)V")
    public void method6920() {
        this.field4602.clear();
    }

    @ObfuscatedName("pl.av(II)I")
    public int method6937(int arg0) {
        return this.method6887(arg0, arg0 + 1);
    }

    @ObfuscatedName("pl.aa(III)I")
    public int method6887(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4602.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method6870() && this.field4590 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class417) this.field4602.get(var4)).field4608;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method6901(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("pl.aq(III)I")
    public int method6945(int arg0, int arg1) {
        if (this.field4603 == null) {
            return 0;
        } else if (this.method6870() && arg0 > this.field4595) {
            return this.field4602.size();
        } else {
            if (!this.field4602.isEmpty()) {
                for (int var3 = 0; var3 < this.field4602.size(); var3++) {
                    class417 var4 = (class417) this.field4602.get(var3);
                    if (arg1 <= var4.field4606 + this.method6869()) {
                        if (arg1 < var4.field4606) {
                            break;
                        }
                        if (arg0 < var4.field4607) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4602.size() && ((class417) this.field4602.get(var3 + 1)).field4606 != var4.field4606) {
                            int var5 = this.method6943((class417) this.field4602.get(var3), false);
                            if (arg0 < var4.field4607 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4606 + this.method6869()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class417 var6 = (class417) this.field4602.get(this.field4602.size() - 1);
                if (arg0 >= var6.field4607 && arg0 <= var6.field4607 + this.method6993() && arg1 >= var6.field4606 && arg1 <= var6.field4606 + this.method6869()) {
                    return this.field4602.size() - 1;
                }
            }
            return this.field4602.size();
        }
    }

    @ObfuscatedName("pl.am(III)I")
    public int method6959(int arg0, int arg1) {
        if (this.field4603 == null || this.method6924() || arg0 > this.field4602.size()) {
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
            class417 var6 = (class417) this.field4602.get(arg0 - 1);
            var4 = var6.field4607 + this.method6903(arg0 - 1);
            var5 = var6.field4606;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4602.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class417 var13 = (class417) this.field4602.get(var12 - 1);
            if (var13.field4606 != var5) {
                var8++;
                var5 = var13.field4606;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4607 + this.method6903(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4602.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("pl.ac(I)I")
    public int method6890() {
        if (!this.field4602.isEmpty() && this.method6893() == 1) {
            return this.field4602.isEmpty() ? 0 : ((class417) this.field4602.get(this.field4602.size() - 1)).field4607 + this.method6993();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4602.size() - 1; var3 >= 0; var3--) {
            class417 var4 = (class417) this.field4602.get(var3);
            if (var4.field4606 != var1) {
                int var5 = this.method6943(var4, false) + var4.field4607;
                var2 = Math.max(var5, var2);
                var1 = var4.field4606;
            }
        }
        return var2;
    }

    @ObfuscatedName("pl.ae(I)I")
    public int method6891() {
        return this.method6924() ? 0 : this.field4603.field4617 + ((class417) this.field4602.get(this.field4602.size() - 1)).field4606;
    }

    @ObfuscatedName("pl.ak(B)I")
    public int method6869() {
        return this.field4599;
    }

    @ObfuscatedName("pl.bp(B)I")
    public int method6893() {
        return this.method6891() / this.field4603.field4617;
    }

    @ObfuscatedName("pl.bz(I)I")
    public int method6993() {
        return this.method6924() ? 0 : this.method6943((class417) this.field4602.get(this.field4602.size() - 1), false);
    }

    @ObfuscatedName("pl.bc(I)I")
    public int method6895() {
        return this.field4595;
    }

    @ObfuscatedName("pl.bf(B)I")
    public int method7000() {
        return this.field4596;
    }

    @ObfuscatedName("pl.be(B)I")
    public int method6898() {
        return this.field4590;
    }

    @ObfuscatedName("pl.bn(B)I")
    public int method6892() {
        return this.field4604;
    }

    @ObfuscatedName("pl.bd(II)I")
    public int method6907(int arg0) {
        switch(this.field4598) {
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

    @ObfuscatedName("pl.bo(IS)I")
    public int method6900(int arg0) {
        switch(this.field4589) {
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

    @ObfuscatedName("pl.bx(I)V")
    public void method6967() {
        this.method6901(0, this.field4602.size());
    }

    @ObfuscatedName("pl.bl(III)V")
    public void method6901(int arg0, int arg1) {
        if (this.method6924() || this.field4603 == null) {
            return;
        }
        class506 var3 = this.method6905(arg0, arg1);
        boolean var4 = (Integer) var3.field5091 == 0 && (Integer) var3.field5090 == this.field4602.size();
        int var5 = (Integer) var3.field5091;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class417) this.field4602.get((Integer) var3.field5091)).field4606;
        int var8 = 0;
        for (int var9 = (Integer) var3.field5091; var9 <= (Integer) var3.field5090; var9++) {
            boolean var10 = var9 >= this.field4602.size();
            class417 var11 = (class417) this.field4602.get(var10 ? this.field4602.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method6943(var11, false);
            boolean var13 = !var10 && var11.field4608 == '\n';
            boolean var14 = !var10 && this.method6870() && var6 + var12 > this.field4595;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4590 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class417 var19 = (class417) this.field4602.get(var18);
                            var17 += var18 < var15 ? this.method6943(var19, false) : 0;
                            if (var19.field4608 == ' ' || var19.field4608 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method6907(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class417 var22 = (class417) this.field4602.get(var21);
                    int var23 = this.method6943(var22, false);
                    var22.field4607 = var20;
                    var22.field4606 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method6869();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4589 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method6869();
        int var25 = this.method6900(var24);
        for (int var26 = 0; var26 < this.field4602.size(); var26++) {
            class417 var27 = (class417) this.field4602.get(var26);
            var27.field4606 -= var25;
        }
    }

    @ObfuscatedName("pl.bh(II)I")
    public int method6903(int arg0) {
        return arg0 < this.field4602.size() ? this.method6943((class417) this.field4602.get(arg0), false) : 0;
    }

    @ObfuscatedName("pl.bs(Lqt;ZI)I")
    public int method6943(class417 arg0, boolean arg1) {
        if (arg0.field4608 == '\n') {
            return 0;
        } else if (arg1 || this.field4604 == 0) {
            int var3 = this.field4603.field4612[arg0.field4608];
            if (var3 == 0) {
                return arg0.field4608 == '\t' ? this.field4603.field4612[32] * 3 : this.field4603.field4612[32];
            } else {
                return var3;
            }
        } else {
            return this.field4603.field4612[42];
        }
    }

    @ObfuscatedName("pl.bj(III)Ltd;")
    public class506 method6905(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4602.size();
        if (var3 == 0 && var4 == var5) {
            return new class506(0, var5);
        }
        int var6 = this.method6906(var3, false);
        int var7 = this.method6885(var4, false);
        switch(this.field4589) {
            case 0:
                if (this.field4598 == 0) {
                    return new class506(var6, var5);
                }
                int var9 = this.method6906(var3, true);
                return new class506(var9, var5);
            case 1:
                return new class506(0, var5);
            case 2:
                if (this.field4598 == 2) {
                    return new class506(0, var7);
                }
                int var8 = this.method6885(var4, true);
                return new class506(0, var8);
            default:
                return new class506(0, var5);
        }
    }

    @ObfuscatedName("pl.bu(IZB)I")
    public int method6906(int arg0, boolean arg1) {
        if (arg0 < this.field4602.size()) {
            int var3 = ((class417) this.field4602.get(arg0)).field4606;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class417) this.field4602.get(var4 - 1)).field4606 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class417) this.field4602.get(var4 - 1)).field4606;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("pl.br(IZB)I")
    public int method6885(int arg0, boolean arg1) {
        if (arg0 < this.field4602.size()) {
            int var3 = ((class417) this.field4602.get(arg0)).field4606;
            for (int var4 = arg0; var4 < this.field4602.size() - 1; var4++) {
                if (((class417) this.field4602.get(var4 + 1)).field4606 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class417) this.field4602.get(var4 + 1)).field4606;
                }
            }
        }
        return this.field4602.size();
    }
}
