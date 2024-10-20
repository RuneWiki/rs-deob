package deob;

import java.util.ArrayList;

@ObfuscatedName("pp")
public class class410 {

    @ObfuscatedName("pp.aj")
    public int field4504 = Integer.MAX_VALUE;

    @ObfuscatedName("pp.an")
    public int field4511 = Integer.MAX_VALUE;

    @ObfuscatedName("pp.au")
    public int field4506 = 0;

    @ObfuscatedName("pp.ai")
    public int field4513 = 0;

    @ObfuscatedName("pp.ae")
    public int field4514 = 0;

    @ObfuscatedName("pp.aw")
    public boolean field4515 = true;

    @ObfuscatedName("pp.aq")
    public class413 field4507;

    @ObfuscatedName("pp.az")
    public ArrayList field4517 = new ArrayList();

    @ObfuscatedName("pp.at")
    public int field4518 = 0;

    @ObfuscatedName("pp.af")
    public int field4519 = 0;

    @ObfuscatedName("pp.ac(II)Lpe;")
    public class412 method6797(int arg0) {
        return (class412) this.field4517.get(arg0);
    }

    @ObfuscatedName("pp.al(I)Lpe;")
    public class412 method6936() {
        return this.field4517.size() == 0 ? null : (class412) this.field4517.get(this.field4517.size() - 1);
    }

    @ObfuscatedName("pp.ak(B)Z")
    public boolean method6811() {
        return this.field4517.size() == 0;
    }

    @ObfuscatedName("pp.ax(B)Z")
    public boolean method6800() {
        return this.field4511 > 1;
    }

    @ObfuscatedName("pp.ao(I)I")
    public int method6801() {
        return this.field4517.size();
    }

    @ObfuscatedName("pp.ah(B)Ljava/lang/String;")
    public String method6802() {
        if (this.method6811()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6801());
        for (int var2 = 0; var2 < this.method6801(); var2++) {
            class412 var3 = this.method6797(var2);
            var1.append(var3.field4524);
        }
        return var1.toString();
    }

    @ObfuscatedName("pp.ar(II)V")
    public void method6861(int arg0) {
        if (this.field4507 != null && arg0 < this.field4507.field4536 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4504 != arg0) {
            this.field4504 = arg0;
            this.method6831();
        }
    }

    @ObfuscatedName("pp.ab(IB)V")
    public void method6804(int arg0) {
        if (this.field4511 != arg0) {
            this.field4511 = arg0;
            this.method6831();
        }
    }

    @ObfuscatedName("pp.am(II)V")
    public void method6805(int arg0) {
        if (this.field4519 != arg0) {
            this.field4519 = arg0;
            this.method6831();
        }
    }

    @ObfuscatedName("pp.av(Lpk;I)V")
    public void method6806(class413 arg0) {
        if (this.field4507 == arg0) {
            return;
        }
        this.field4507 = arg0;
        if (this.field4507 == null) {
            return;
        }
        if (this.field4514 == 0) {
            this.field4514 = this.field4507.field4536;
        }
        if (!this.method6811()) {
            this.method6831();
        }
    }

    @ObfuscatedName("pp.ag(II)V")
    public void method6807(int arg0) {
        if (this.field4518 != arg0) {
            this.field4518 = arg0;
            this.method6831();
        }
    }

    @ObfuscatedName("pp.aa(III)Z")
    public boolean method6808(int arg0, int arg1) {
        if (this.field4506 != arg0 || this.field4513 != arg1) {
            this.field4506 = arg0;
            this.field4513 = arg1;
            this.method6831();
        }
        return true;
    }

    @ObfuscatedName("pp.ap(II)V")
    public void method6809(int arg0) {
        if (this.field4514 != arg0) {
            this.field4514 = arg0;
            this.method6831();
        }
    }

    @ObfuscatedName("pp.ay(III)Lpr;")
    public class414 method6883(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class414(this, 0, 0);
        } else if (arg0 <= this.field4517.size() && arg1 <= this.field4517.size()) {
            return arg1 < arg0 ? new class414(this, arg1, arg0) : new class414(this, arg0, arg1);
        } else {
            return new class414(this, 0, 0);
        }
    }

    @ObfuscatedName("pp.as(CIIS)Lpb;")
    public class411 method6917(char arg0, int arg1, int arg2) {
        return this.method6812(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("pp.aj(Ljava/lang/String;IIB)Lpb;")
    public class411 method6812(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4517.size() >= arg2) {
            this.method6832(arg1, arg1);
            return new class411(arg1, true);
        }
        this.field4517.ensureCapacity(this.field4517.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4517.size() < arg2; var5++) {
            class412 var6 = new class412();
            var6.field4524 = arg0.charAt(var5);
            this.field4517.add(var4, var6);
            var4++;
        }
        this.method6832(arg1, var4);
        if (this.field4511 == 0 || this.method6823() <= this.field4511) {
            return new class411(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method6816(var4);
            if (this.method6823() <= this.field4511) {
                break;
            }
        }
        return new class411(var4, true);
    }

    @ObfuscatedName("pp.an(Ljava/lang/String;II)Lpb;")
    public class411 method6813(String arg0, int arg1) {
        return this.method6812(arg0, this.field4517.size(), arg1);
    }

    @ObfuscatedName("pp.au(Ljava/lang/String;I)Lpb;")
    public class411 method6886(String arg0) {
        this.method6815();
        return this.method6813(arg0, 0);
    }

    @ObfuscatedName("pp.ai(S)V")
    public void method6815() {
        this.field4517.clear();
    }

    @ObfuscatedName("pp.ae(II)I")
    public int method6816(int arg0) {
        return this.method6817(arg0, arg0 + 1);
    }

    @ObfuscatedName("pp.aw(III)I")
    public int method6817(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4517.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method6800() && this.field4518 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class412) this.field4517.get(var4)).field4524;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method6832(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("pp.aq(III)I")
    public int method6818(int arg0, int arg1) {
        if (this.field4507 == null) {
            return 0;
        } else if (this.method6800() && arg0 > this.field4504) {
            return this.field4517.size();
        } else {
            if (!this.field4517.isEmpty()) {
                for (int var3 = 0; var3 < this.field4517.size(); var3++) {
                    class412 var4 = (class412) this.field4517.get(var3);
                    if (arg1 <= var4.field4526 + this.method6822()) {
                        if (arg1 < var4.field4526) {
                            break;
                        }
                        if (arg0 < var4.field4525) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4517.size() && ((class412) this.field4517.get(var3 + 1)).field4526 != var4.field4526) {
                            int var5 = this.method6912((class412) this.field4517.get(var3), false);
                            if (arg0 < var4.field4525 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4526 + this.method6822()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class412 var6 = (class412) this.field4517.get(this.field4517.size() - 1);
                if (arg0 >= var6.field4525 && arg0 <= var6.field4525 + this.method6913() && arg1 >= var6.field4526 && arg1 <= var6.field4526 + this.method6822()) {
                    return this.field4517.size() - 1;
                }
            }
            return this.field4517.size();
        }
    }

    @ObfuscatedName("pp.az(III)I")
    public int method6819(int arg0, int arg1) {
        if (this.field4507 == null || this.method6811() || arg0 > this.field4517.size()) {
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
            class412 var6 = (class412) this.field4517.get(arg0 - 1);
            var4 = var6.field4525 + this.method6799(arg0 - 1);
            var5 = var6.field4526;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4517.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class412 var13 = (class412) this.field4517.get(var12 - 1);
            if (var13.field4526 != var5) {
                var8++;
                var5 = var13.field4526;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4525 + this.method6799(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4517.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("pp.at(I)I")
    public int method6820() {
        if (!this.field4517.isEmpty() && this.method6823() == 1) {
            return this.field4517.isEmpty() ? 0 : ((class412) this.field4517.get(this.field4517.size() - 1)).field4525 + this.method6913();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4517.size() - 1; var3 >= 0; var3--) {
            class412 var4 = (class412) this.field4517.get(var3);
            if (var4.field4526 != var1) {
                int var5 = this.method6912(var4, false) + var4.field4525;
                var2 = Math.max(var5, var2);
                var1 = var4.field4526;
            }
        }
        return var2;
    }

    @ObfuscatedName("pp.af(B)I")
    public int method6821() {
        return this.method6811() ? 0 : this.field4507.field4536 + ((class412) this.field4517.get(this.field4517.size() - 1)).field4526;
    }

    @ObfuscatedName("pp.ad(B)I")
    public int method6822() {
        return this.field4514;
    }

    @ObfuscatedName("pp.bn(I)I")
    public int method6823() {
        return this.method6821() / this.field4507.field4536;
    }

    @ObfuscatedName("pp.bk(I)I")
    public int method6913() {
        return this.method6811() ? 0 : this.method6912((class412) this.field4517.get(this.field4517.size() - 1), false);
    }

    @ObfuscatedName("pp.by(B)I")
    public int method6810() {
        return this.field4504;
    }

    @ObfuscatedName("pp.bd(I)I")
    public int method6838() {
        return this.field4511;
    }

    @ObfuscatedName("pp.be(I)I")
    public int method6827() {
        return this.field4518;
    }

    @ObfuscatedName("pp.bv(B)I")
    public int method6828() {
        return this.field4519;
    }

    @ObfuscatedName("pp.ba(II)I")
    public int method6829(int arg0) {
        switch(this.field4506) {
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

    @ObfuscatedName("pp.bz(II)I")
    public int method6929(int arg0) {
        switch(this.field4513) {
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

    @ObfuscatedName("pp.bb(I)V")
    public void method6831() {
        this.method6832(0, this.field4517.size());
    }

    @ObfuscatedName("pp.bo(III)V")
    public void method6832(int arg0, int arg1) {
        if (this.method6811() || this.field4507 == null) {
            return;
        }
        class501 var3 = this.method6835(arg0, arg1);
        boolean var4 = (Integer) var3.field5004 == 0 && (Integer) var3.field5005 == this.field4517.size();
        int var5 = (Integer) var3.field5004;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class412) this.field4517.get((Integer) var3.field5004)).field4526;
        int var8 = 0;
        for (int var9 = (Integer) var3.field5004; var9 <= (Integer) var3.field5005; var9++) {
            boolean var10 = var9 >= this.field4517.size();
            class412 var11 = (class412) this.field4517.get(var10 ? this.field4517.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method6912(var11, false);
            boolean var13 = !var10 && var11.field4524 == '\n';
            boolean var14 = !var10 && this.method6800() && var6 + var12 > this.field4504;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4518 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class412 var19 = (class412) this.field4517.get(var18);
                            var17 += var18 < var15 ? this.method6912(var19, false) : 0;
                            if (var19.field4524 == ' ' || var19.field4524 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method6829(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class412 var22 = (class412) this.field4517.get(var21);
                    int var23 = this.method6912(var22, false);
                    var22.field4525 = var20;
                    var22.field4526 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method6822();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4513 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method6822();
        int var25 = this.method6929(var24);
        for (int var26 = 0; var26 < this.field4517.size(); var26++) {
            class412 var27 = (class412) this.field4517.get(var26);
            var27.field4526 -= var25;
        }
    }

    @ObfuscatedName("pp.bp(II)I")
    public int method6799(int arg0) {
        return arg0 < this.field4517.size() ? this.method6912((class412) this.field4517.get(arg0), false) : 0;
    }

    @ObfuscatedName("pp.bt(Lpe;ZI)I")
    public int method6912(class412 arg0, boolean arg1) {
        if (arg0.field4524 == '\n') {
            return 0;
        } else if (arg1 || this.field4519 == 0) {
            int var3 = this.field4507.field4533[arg0.field4524];
            if (var3 == 0) {
                return arg0.field4524 == '\t' ? this.field4507.field4533[32] * 3 : this.field4507.field4533[32];
            } else {
                return var3;
            }
        } else {
            return this.field4507.field4533[42];
        }
    }

    @ObfuscatedName("pp.bm(IIB)Ltw;")
    public class501 method6835(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4517.size();
        if (var3 == 0 && var4 == var5) {
            return new class501(0, var5);
        }
        int var6 = this.method6836(var3, false);
        int var7 = this.method6837(var4, false);
        switch(this.field4513) {
            case 0:
                if (this.field4506 == 0) {
                    return new class501(var6, var5);
                }
                int var9 = this.method6836(var3, true);
                return new class501(var9, var5);
            case 1:
                return new class501(0, var5);
            case 2:
                if (this.field4506 == 2) {
                    return new class501(0, var7);
                }
                int var8 = this.method6837(var4, true);
                return new class501(0, var8);
            default:
                return new class501(0, var5);
        }
    }

    @ObfuscatedName("pp.br(IZS)I")
    public int method6836(int arg0, boolean arg1) {
        if (arg0 < this.field4517.size()) {
            int var3 = ((class412) this.field4517.get(arg0)).field4526;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class412) this.field4517.get(var4 - 1)).field4526 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class412) this.field4517.get(var4 - 1)).field4526;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("pp.bs(IZI)I")
    public int method6837(int arg0, boolean arg1) {
        if (arg0 < this.field4517.size()) {
            int var3 = ((class412) this.field4517.get(arg0)).field4526;
            for (int var4 = arg0; var4 < this.field4517.size() - 1; var4++) {
                if (((class412) this.field4517.get(var4 + 1)).field4526 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class412) this.field4517.get(var4 + 1)).field4526;
                }
            }
        }
        return this.field4517.size();
    }
}
