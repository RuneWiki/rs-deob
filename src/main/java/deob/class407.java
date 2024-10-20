package deob;

import java.util.ArrayList;

@ObfuscatedName("pv")
public class class407 {

    @ObfuscatedName("pv.ak")
    public int field4495 = Integer.MAX_VALUE;

    @ObfuscatedName("pv.aj")
    public int field4504 = Integer.MAX_VALUE;

    @ObfuscatedName("pv.am")
    public int field4498 = 0;

    @ObfuscatedName("pv.aq")
    public int field4501 = 0;

    @ObfuscatedName("pv.ai")
    public int field4499 = 0;

    @ObfuscatedName("pv.aw")
    public boolean field4500 = true;

    @ObfuscatedName("pv.ae")
    public class410 field4490;

    @ObfuscatedName("pv.an")
    public ArrayList field4502 = new ArrayList();

    @ObfuscatedName("pv.ag")
    public int field4503 = 0;

    @ObfuscatedName("pv.ad")
    public int field4506 = 0;

    @ObfuscatedName("pv.at(II)Lpn;")
    public class409 method6868(int arg0) {
        return (class409) this.field4502.get(arg0);
    }

    @ObfuscatedName("pv.ah(I)Lpn;")
    public class409 method6888() {
        return this.field4502.size() == 0 ? null : (class409) this.field4502.get(this.field4502.size() - 1);
    }

    @ObfuscatedName("pv.ar(I)Z")
    public boolean method6836() {
        return this.field4502.size() == 0;
    }

    @ObfuscatedName("pv.ao(I)Z")
    public boolean method6837() {
        return this.field4504 > 1;
    }

    @ObfuscatedName("pv.ab(I)I")
    public int method6838() {
        return this.field4502.size();
    }

    @ObfuscatedName("pv.au(I)Ljava/lang/String;")
    public String method6839() {
        if (this.method6836()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6838());
        for (int var2 = 0; var2 < this.method6838(); var2++) {
            class409 var3 = this.method6868(var2);
            var1.append(var3.field4510);
        }
        return var1.toString();
    }

    @ObfuscatedName("pv.aa(II)V")
    public void method6840(int arg0) {
        if (this.field4490 != null && arg0 < this.field4490.field4520 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4495 != arg0) {
            this.field4495 = arg0;
            this.method6859();
        }
    }

    @ObfuscatedName("pv.ac(II)V")
    public void method6841(int arg0) {
        if (this.field4504 != arg0) {
            this.field4504 = arg0;
            this.method6859();
        }
    }

    @ObfuscatedName("pv.al(II)V")
    public void method6842(int arg0) {
        if (this.field4506 != arg0) {
            this.field4506 = arg0;
            this.method6859();
        }
    }

    @ObfuscatedName("pv.az(Lpa;B)V")
    public void method6843(class410 arg0) {
        if (this.field4490 == arg0) {
            return;
        }
        this.field4490 = arg0;
        if (this.field4490 == null) {
            return;
        }
        if (this.field4499 == 0) {
            this.field4499 = this.field4490.field4520;
        }
        if (!this.method6836()) {
            this.method6859();
        }
    }

    @ObfuscatedName("pv.ap(II)V")
    public void method6941(int arg0) {
        if (this.field4503 != arg0) {
            this.field4503 = arg0;
            this.method6859();
        }
    }

    @ObfuscatedName("pv.av(III)Z")
    public boolean method6845(int arg0, int arg1) {
        if (this.field4498 != arg0 || this.field4501 != arg1) {
            this.field4498 = arg0;
            this.field4501 = arg1;
            this.method6859();
        }
        return true;
    }

    @ObfuscatedName("pv.ax(IB)V")
    public void method6846(int arg0) {
        if (this.field4499 != arg0) {
            this.field4499 = arg0;
            this.method6859();
        }
    }

    @ObfuscatedName("pv.as(IIB)Lpd;")
    public class411 method6847(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class411(this, 0, 0);
        } else if (arg0 <= this.field4502.size() && arg1 <= this.field4502.size()) {
            return arg1 < arg0 ? new class411(this, arg1, arg0) : new class411(this, arg0, arg1);
        } else {
            return new class411(this, 0, 0);
        }
    }

    @ObfuscatedName("pv.ay(CIIB)Lpx;")
    public class408 method6947(char arg0, int arg1, int arg2) {
        return this.method6849(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("pv.ak(Ljava/lang/String;III)Lpx;")
    public class408 method6849(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4502.size() >= arg2) {
            this.method6910(arg1, arg1);
            return new class408(arg1, true);
        }
        this.field4502.ensureCapacity(this.field4502.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4502.size() < arg2; var5++) {
            class409 var6 = new class409();
            var6.field4510 = arg0.charAt(var5);
            this.field4502.add(var4, var6);
            var4++;
        }
        this.method6910(arg1, var4);
        if (this.field4504 == 0 || this.method6860() <= this.field4504) {
            return new class408(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method6885(var4);
            if (this.method6860() <= this.field4504) {
                break;
            }
        }
        return new class408(var4, true);
    }

    @ObfuscatedName("pv.aj(Ljava/lang/String;IB)Lpx;")
    public class408 method6850(String arg0, int arg1) {
        return this.method6849(arg0, this.field4502.size(), arg1);
    }

    @ObfuscatedName("pv.am(Ljava/lang/String;B)Lpx;")
    public class408 method6851(String arg0) {
        this.method6852();
        return this.method6850(arg0, 0);
    }

    @ObfuscatedName("pv.aq(B)V")
    public void method6852() {
        this.field4502.clear();
    }

    @ObfuscatedName("pv.ai(II)I")
    public int method6885(int arg0) {
        return this.method6854(arg0, arg0 + 1);
    }

    @ObfuscatedName("pv.aw(IIB)I")
    public int method6854(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4502.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method6837() && this.field4503 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class409) this.field4502.get(var4)).field4510;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method6910(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("pv.ae(III)I")
    public int method6855(int arg0, int arg1) {
        if (this.field4490 == null) {
            return 0;
        } else if (this.method6837() && arg0 > this.field4495) {
            return this.field4502.size();
        } else {
            if (!this.field4502.isEmpty()) {
                for (int var3 = 0; var3 < this.field4502.size(); var3++) {
                    class409 var4 = (class409) this.field4502.get(var3);
                    if (arg1 <= var4.field4508 + this.method6930()) {
                        if (arg1 < var4.field4508) {
                            break;
                        }
                        if (arg0 < var4.field4509) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4502.size() && ((class409) this.field4502.get(var3 + 1)).field4508 != var4.field4508) {
                            int var5 = this.method6871((class409) this.field4502.get(var3), false);
                            if (arg0 < var4.field4509 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4508 + this.method6930()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class409 var6 = (class409) this.field4502.get(this.field4502.size() - 1);
                if (arg0 >= var6.field4509 && arg0 <= var6.field4509 + this.method6861() && arg1 >= var6.field4508 && arg1 <= var6.field4508 + this.method6930()) {
                    return this.field4502.size() - 1;
                }
            }
            return this.field4502.size();
        }
    }

    @ObfuscatedName("pv.an(III)I")
    public int method6856(int arg0, int arg1) {
        if (this.field4490 == null || this.method6836() || arg0 > this.field4502.size()) {
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
            class409 var6 = (class409) this.field4502.get(arg0 - 1);
            var4 = var6.field4509 + this.method6926(arg0 - 1);
            var5 = var6.field4508;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4502.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class409 var13 = (class409) this.field4502.get(var12 - 1);
            if (var13.field4508 != var5) {
                var8++;
                var5 = var13.field4508;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4509 + this.method6926(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4502.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("pv.ag(I)I")
    public int method6969() {
        if (!this.field4502.isEmpty() && this.method6860() == 1) {
            return this.field4502.isEmpty() ? 0 : ((class409) this.field4502.get(this.field4502.size() - 1)).field4509 + this.method6861();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4502.size() - 1; var3 >= 0; var3--) {
            class409 var4 = (class409) this.field4502.get(var3);
            if (var4.field4508 != var1) {
                int var5 = this.method6871(var4, false) + var4.field4509;
                var2 = Math.max(var5, var2);
                var1 = var4.field4508;
            }
        }
        return var2;
    }

    @ObfuscatedName("pv.ad(B)I")
    public int method6934() {
        return this.method6836() ? 0 : this.field4490.field4520 + ((class409) this.field4502.get(this.field4502.size() - 1)).field4508;
    }

    @ObfuscatedName("pv.af(I)I")
    public int method6930() {
        return this.field4499;
    }

    @ObfuscatedName("pv.be(B)I")
    public int method6860() {
        return this.method6934() / this.field4490.field4520;
    }

    @ObfuscatedName("pv.bd(I)I")
    public int method6861() {
        return this.method6836() ? 0 : this.method6871((class409) this.field4502.get(this.field4502.size() - 1), false);
    }

    @ObfuscatedName("pv.bl(I)I")
    public int method6862() {
        return this.field4495;
    }

    @ObfuscatedName("pv.bi(I)I")
    public int method6863() {
        return this.field4504;
    }

    @ObfuscatedName("pv.bv(I)I")
    public int method6864() {
        return this.field4503;
    }

    @ObfuscatedName("pv.bf(I)I")
    public int method6865() {
        return this.field4506;
    }

    @ObfuscatedName("pv.bg(II)I")
    public int method6876(int arg0) {
        switch(this.field4498) {
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

    @ObfuscatedName("pv.ba(II)I")
    public int method6867(int arg0) {
        switch(this.field4501) {
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

    @ObfuscatedName("pv.bm(B)V")
    public void method6859() {
        this.method6910(0, this.field4502.size());
    }

    @ObfuscatedName("pv.bp(III)V")
    public void method6910(int arg0, int arg1) {
        if (this.method6836() || this.field4490 == null) {
            return;
        }
        class498 var3 = this.method6872(arg0, arg1);
        boolean var4 = (Integer) var3.field4997 == 0 && (Integer) var3.field4998 == this.field4502.size();
        int var5 = (Integer) var3.field4997;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class409) this.field4502.get((Integer) var3.field4997)).field4508;
        int var8 = 0;
        for (int var9 = (Integer) var3.field4997; var9 <= (Integer) var3.field4998; var9++) {
            boolean var10 = var9 >= this.field4502.size();
            class409 var11 = (class409) this.field4502.get(var10 ? this.field4502.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method6871(var11, false);
            boolean var13 = !var10 && var11.field4510 == '\n';
            boolean var14 = !var10 && this.method6837() && var6 + var12 > this.field4495;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4503 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class409 var19 = (class409) this.field4502.get(var18);
                            var17 += var18 < var15 ? this.method6871(var19, false) : 0;
                            if (var19.field4510 == ' ' || var19.field4510 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method6876(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class409 var22 = (class409) this.field4502.get(var21);
                    int var23 = this.method6871(var22, false);
                    var22.field4509 = var20;
                    var22.field4508 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method6930();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4501 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method6930();
        int var25 = this.method6867(var24);
        for (int var26 = 0; var26 < this.field4502.size(); var26++) {
            class409 var27 = (class409) this.field4502.get(var26);
            var27.field4508 -= var25;
        }
    }

    @ObfuscatedName("pv.bw(II)I")
    public int method6926(int arg0) {
        return arg0 < this.field4502.size() ? this.method6871((class409) this.field4502.get(arg0), false) : 0;
    }

    @ObfuscatedName("pv.bj(Lpn;ZI)I")
    public int method6871(class409 arg0, boolean arg1) {
        if (arg0.field4510 == '\n') {
            return 0;
        } else if (arg1 || this.field4506 == 0) {
            int var3 = this.field4490.field4515[arg0.field4510];
            if (var3 == 0) {
                return arg0.field4510 == '\t' ? this.field4490.field4515[32] * 3 : this.field4490.field4515[32];
            } else {
                return var3;
            }
        } else {
            return this.field4490.field4515[42];
        }
    }

    @ObfuscatedName("pv.bn(III)Lti;")
    public class498 method6872(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4502.size();
        if (var3 == 0 && var4 == var5) {
            return new class498(0, var5);
        }
        int var6 = this.method6873(var3, false);
        int var7 = this.method6874(var4, false);
        switch(this.field4501) {
            case 0:
                if (this.field4498 == 0) {
                    return new class498(var6, var5);
                }
                int var9 = this.method6873(var3, true);
                return new class498(var9, var5);
            case 1:
                return new class498(0, var5);
            case 2:
                if (this.field4498 == 2) {
                    return new class498(0, var7);
                }
                int var8 = this.method6874(var4, true);
                return new class498(0, var8);
            default:
                return new class498(0, var5);
        }
    }

    @ObfuscatedName("pv.bo(IZB)I")
    public int method6873(int arg0, boolean arg1) {
        if (arg0 < this.field4502.size()) {
            int var3 = ((class409) this.field4502.get(arg0)).field4508;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class409) this.field4502.get(var4 - 1)).field4508 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class409) this.field4502.get(var4 - 1)).field4508;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("pv.bt(IZI)I")
    public int method6874(int arg0, boolean arg1) {
        if (arg0 < this.field4502.size()) {
            int var3 = ((class409) this.field4502.get(arg0)).field4508;
            for (int var4 = arg0; var4 < this.field4502.size() - 1; var4++) {
                if (((class409) this.field4502.get(var4 + 1)).field4508 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class409) this.field4502.get(var4 + 1)).field4508;
                }
            }
        }
        return this.field4502.size();
    }
}
