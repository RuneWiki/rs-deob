package deob;

import java.util.ArrayList;

@ObfuscatedName("pv")
public class class414 {

    @ObfuscatedName("pv.an")
    public int field4575 = Integer.MAX_VALUE;

    @ObfuscatedName("pv.ag")
    public int field4573 = Integer.MAX_VALUE;

    @ObfuscatedName("pv.am")
    public int field4574 = 0;

    @ObfuscatedName("pv.ad")
    public int field4576 = 0;

    @ObfuscatedName("pv.at")
    public int field4579 = 0;

    @ObfuscatedName("pv.ay")
    public boolean field4577 = true;

    @ObfuscatedName("pv.ae")
    public class417 field4578;

    @ObfuscatedName("pv.ac")
    public ArrayList field4571 = new ArrayList();

    @ObfuscatedName("pv.ab")
    public int field4580 = 0;

    @ObfuscatedName("pv.av")
    public int field4581 = 0;

    @ObfuscatedName("pv.aq(II)Lpu;")
    public class416 method7065(int arg0) {
        return (class416) this.field4571.get(arg0);
    }

    @ObfuscatedName("pv.aw(I)Lpu;")
    public class416 method7118() {
        return this.field4571.size() == 0 ? null : (class416) this.field4571.get(this.field4571.size() - 1);
    }

    @ObfuscatedName("pv.al(I)Z")
    public boolean method7068() {
        return this.field4571.size() == 0;
    }

    @ObfuscatedName("pv.ai(I)Z")
    public boolean method6983() {
        return this.field4573 > 1;
    }

    @ObfuscatedName("pv.ar(B)I")
    public int method7001() {
        return this.field4571.size();
    }

    @ObfuscatedName("pv.as(I)Ljava/lang/String;")
    public String method7044() {
        if (this.method7068()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7001());
        for (int var2 = 0; var2 < this.method7001(); var2++) {
            class416 var3 = this.method7065(var2);
            var1.append(var3.field4584);
        }
        return var1.toString();
    }

    @ObfuscatedName("pv.aa(II)V")
    public void method6990(int arg0) {
        if (this.field4578 != null && arg0 < this.field4578.field4594 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4575 != arg0) {
            this.field4575 = arg0;
            this.method7018();
        }
    }

    @ObfuscatedName("pv.az(IB)V")
    public void method6991(int arg0) {
        if (this.field4573 != arg0) {
            this.field4573 = arg0;
            this.method7018();
        }
    }

    @ObfuscatedName("pv.ao(IB)V")
    public void method7021(int arg0) {
        if (this.field4581 != arg0) {
            this.field4581 = arg0;
            this.method7018();
        }
    }

    @ObfuscatedName("pv.au(Lqi;I)V")
    public void method7090(class417 arg0) {
        if (this.field4578 == arg0) {
            return;
        }
        this.field4578 = arg0;
        if (this.field4578 == null) {
            return;
        }
        if (this.field4579 == 0) {
            this.field4579 = this.field4578.field4594;
        }
        if (!this.method7068()) {
            this.method7018();
        }
    }

    @ObfuscatedName("pv.ak(II)V")
    public void method7069(int arg0) {
        if (this.field4580 != arg0) {
            this.field4580 = arg0;
            this.method7018();
        }
    }

    @ObfuscatedName("pv.ah(III)Z")
    public boolean method6995(int arg0, int arg1) {
        if (this.field4574 != arg0 || this.field4576 != arg1) {
            this.field4574 = arg0;
            this.field4576 = arg1;
            this.method7018();
        }
        return true;
    }

    @ObfuscatedName("pv.aj(II)V")
    public void method6996(int arg0) {
        if (this.field4579 != arg0) {
            this.field4579 = arg0;
            this.method7018();
        }
    }

    @ObfuscatedName("pv.af(IIB)Lqz;")
    public class418 method6997(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class418(this, 0, 0);
        } else if (arg0 <= this.field4571.size() && arg1 <= this.field4571.size()) {
            return arg1 < arg0 ? new class418(this, arg1, arg0) : new class418(this, arg0, arg1);
        } else {
            return new class418(this, 0, 0);
        }
    }

    @ObfuscatedName("pv.ax(CIIB)Lpa;")
    public class415 method6998(char arg0, int arg1, int arg2) {
        return this.method6999(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("pv.an(Ljava/lang/String;IIB)Lpa;")
    public class415 method6999(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4571.size() >= arg2) {
            this.method7019(arg1, arg1);
            return new class415(arg1, true);
        }
        this.field4571.ensureCapacity(this.field4571.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4571.size() < arg2; var5++) {
            class416 var6 = new class416();
            var6.field4584 = arg0.charAt(var5);
            this.field4571.add(var4, var6);
            var4++;
        }
        this.method7019(arg1, var4);
        if (this.field4573 == 0 || this.method7010() <= this.field4573) {
            return new class415(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method7003(var4);
            if (this.method7010() <= this.field4573) {
                break;
            }
        }
        return new class415(var4, true);
    }

    @ObfuscatedName("pv.ag(Ljava/lang/String;II)Lpa;")
    public class415 method7000(String arg0, int arg1) {
        return this.method6999(arg0, this.field4571.size(), arg1);
    }

    @ObfuscatedName("pv.am(Ljava/lang/String;I)Lpa;")
    public class415 method7082(String arg0) {
        this.method7002();
        return this.method7000(arg0, 0);
    }

    @ObfuscatedName("pv.ad(B)V")
    public void method7002() {
        this.field4571.clear();
    }

    @ObfuscatedName("pv.at(IB)I")
    public int method7003(int arg0) {
        return this.method7088(arg0, arg0 + 1);
    }

    @ObfuscatedName("pv.ay(III)I")
    public int method7088(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4571.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method6983() && this.field4580 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class416) this.field4571.get(var4)).field4584;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method7019(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("pv.ae(IIS)I")
    public int method7005(int arg0, int arg1) {
        if (this.field4578 == null) {
            return 0;
        } else if (this.method6983() && arg0 > this.field4575) {
            return this.field4571.size();
        } else {
            if (!this.field4571.isEmpty()) {
                for (int var3 = 0; var3 < this.field4571.size(); var3++) {
                    class416 var4 = (class416) this.field4571.get(var3);
                    if (arg1 <= var4.field4586 + this.method7009()) {
                        if (arg1 < var4.field4586) {
                            break;
                        }
                        if (arg0 < var4.field4585) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4571.size() && ((class416) this.field4571.get(var3 + 1)).field4586 != var4.field4586) {
                            int var5 = this.method6987((class416) this.field4571.get(var3), false);
                            if (arg0 < var4.field4585 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4586 + this.method7009()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class416 var6 = (class416) this.field4571.get(this.field4571.size() - 1);
                if (arg0 >= var6.field4585 && arg0 <= var6.field4585 + this.method7011() && arg1 >= var6.field4586 && arg1 <= var6.field4586 + this.method7009()) {
                    return this.field4571.size() - 1;
                }
            }
            return this.field4571.size();
        }
    }

    @ObfuscatedName("pv.ac(III)I")
    public int method7006(int arg0, int arg1) {
        if (this.field4578 == null || this.method7068() || arg0 > this.field4571.size()) {
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
            class416 var6 = (class416) this.field4571.get(arg0 - 1);
            var4 = var6.field4585 + this.method7012(arg0 - 1);
            var5 = var6.field4586;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4571.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class416 var13 = (class416) this.field4571.get(var12 - 1);
            if (var13.field4586 != var5) {
                var8++;
                var5 = var13.field4586;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4585 + this.method7012(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4571.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("pv.ab(B)I")
    public int method7007() {
        if (!this.field4571.isEmpty() && this.method7010() == 1) {
            return this.field4571.isEmpty() ? 0 : ((class416) this.field4571.get(this.field4571.size() - 1)).field4585 + this.method7011();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4571.size() - 1; var3 >= 0; var3--) {
            class416 var4 = (class416) this.field4571.get(var3);
            if (var4.field4586 != var1) {
                int var5 = this.method6987(var4, false) + var4.field4585;
                var2 = Math.max(var5, var2);
                var1 = var4.field4586;
            }
        }
        return var2;
    }

    @ObfuscatedName("pv.av(I)I")
    public int method7025() {
        return this.method7068() ? 0 : this.field4578.field4594 + ((class416) this.field4571.get(this.field4571.size() - 1)).field4586;
    }

    @ObfuscatedName("pv.ap(I)I")
    public int method7009() {
        return this.field4579;
    }

    @ObfuscatedName("pv.bu(S)I")
    public int method7010() {
        return this.method7025() / this.field4578.field4594;
    }

    @ObfuscatedName("pv.bo(I)I")
    public int method7011() {
        return this.method7068() ? 0 : this.method6987((class416) this.field4571.get(this.field4571.size() - 1), false);
    }

    @ObfuscatedName("pv.bd(B)I")
    public int method7057() {
        return this.field4575;
    }

    @ObfuscatedName("pv.bi(I)I")
    public int method7098() {
        return this.field4573;
    }

    @ObfuscatedName("pv.bq(I)I")
    public int method7014() {
        return this.field4580;
    }

    @ObfuscatedName("pv.ba(I)I")
    public int method7055() {
        return this.field4581;
    }

    @ObfuscatedName("pv.bt(IB)I")
    public int method7063(int arg0) {
        switch(this.field4574) {
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

    @ObfuscatedName("pv.bk(IS)I")
    public int method7076(int arg0) {
        switch(this.field4576) {
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

    @ObfuscatedName("pv.bm(I)V")
    public void method7018() {
        this.method7019(0, this.field4571.size());
    }

    @ObfuscatedName("pv.bw(III)V")
    public void method7019(int arg0, int arg1) {
        if (this.method7068() || this.field4578 == null) {
            return;
        }
        class505 var3 = this.method7020(arg0, arg1);
        boolean var4 = (Integer) var3.field5064 == 0 && (Integer) var3.field5065 == this.field4571.size();
        int var5 = (Integer) var3.field5064;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class416) this.field4571.get((Integer) var3.field5064)).field4586;
        int var8 = 0;
        for (int var9 = (Integer) var3.field5064; var9 <= (Integer) var3.field5065; var9++) {
            boolean var10 = var9 >= this.field4571.size();
            class416 var11 = (class416) this.field4571.get(var10 ? this.field4571.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method6987(var11, false);
            boolean var13 = !var10 && var11.field4584 == '\n';
            boolean var14 = !var10 && this.method6983() && var6 + var12 > this.field4575;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4580 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class416 var19 = (class416) this.field4571.get(var18);
                            var17 += var18 < var15 ? this.method6987(var19, false) : 0;
                            if (var19.field4584 == ' ' || var19.field4584 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method7063(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class416 var22 = (class416) this.field4571.get(var21);
                    int var23 = this.method6987(var22, false);
                    var22.field4585 = var20;
                    var22.field4586 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method7009();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4576 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method7009();
        int var25 = this.method7076(var24);
        for (int var26 = 0; var26 < this.field4571.size(); var26++) {
            class416 var27 = (class416) this.field4571.get(var26);
            var27.field4586 -= var25;
        }
    }

    @ObfuscatedName("pv.bv(II)I")
    public int method7012(int arg0) {
        return arg0 < this.field4571.size() ? this.method6987((class416) this.field4571.get(arg0), false) : 0;
    }

    @ObfuscatedName("pv.by(Lpu;ZB)I")
    public int method6987(class416 arg0, boolean arg1) {
        if (arg0.field4584 == '\n') {
            return 0;
        } else if (arg1 || this.field4581 == 0) {
            int var3 = this.field4578.field4607[arg0.field4584];
            if (var3 == 0) {
                return arg0.field4584 == '\t' ? this.field4578.field4607[32] * 3 : this.field4578.field4607[32];
            } else {
                return var3;
            }
        } else {
            return this.field4578.field4607[42];
        }
    }

    @ObfuscatedName("pv.bb(IIB)Lth;")
    public class505 method7020(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4571.size();
        if (var3 == 0 && var4 == var5) {
            return new class505(0, var5);
        }
        int var6 = this.method7023(var3, false);
        int var7 = this.method7078(var4, false);
        switch(this.field4576) {
            case 0:
                if (this.field4574 == 0) {
                    return new class505(var6, var5);
                }
                int var9 = this.method7023(var3, true);
                return new class505(var9, var5);
            case 1:
                return new class505(0, var5);
            case 2:
                if (this.field4574 == 2) {
                    return new class505(0, var7);
                }
                int var8 = this.method7078(var4, true);
                return new class505(0, var8);
            default:
                return new class505(0, var5);
        }
    }

    @ObfuscatedName("pv.bn(IZI)I")
    public int method7023(int arg0, boolean arg1) {
        if (arg0 < this.field4571.size()) {
            int var3 = ((class416) this.field4571.get(arg0)).field4586;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class416) this.field4571.get(var4 - 1)).field4586 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class416) this.field4571.get(var4 - 1)).field4586;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("pv.br(IZB)I")
    public int method7078(int arg0, boolean arg1) {
        if (arg0 < this.field4571.size()) {
            int var3 = ((class416) this.field4571.get(arg0)).field4586;
            for (int var4 = arg0; var4 < this.field4571.size() - 1; var4++) {
                if (((class416) this.field4571.get(var4 + 1)).field4586 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class416) this.field4571.get(var4 + 1)).field4586;
                }
            }
        }
        return this.field4571.size();
    }
}
