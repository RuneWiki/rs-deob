package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("jw")
public class class245 {

    @ObfuscatedName("jw.aj")
    public int field2849 = -1;

    @ObfuscatedName("jw.al")
    public String field2841;

    @ObfuscatedName("jw.ac")
    public String field2842;

    @ObfuscatedName("jw.ab")
    public int field2852 = -1;

    @ObfuscatedName("jw.an")
    public int field2844 = -1;

    @ObfuscatedName("jw.ao")
    public class304 field2845 = null;

    @ObfuscatedName("jw.av")
    public int field2846 = Integer.MAX_VALUE;

    @ObfuscatedName("jw.aq")
    public int field2847 = 0;

    @ObfuscatedName("jw.ap")
    public int field2848 = Integer.MAX_VALUE;

    @ObfuscatedName("jw.ar")
    public int field2843 = 0;

    @ObfuscatedName("jw.ak")
    public boolean field2850 = false;

    @ObfuscatedName("jw.ax")
    public LinkedList field2840;

    @ObfuscatedName("jw.aj(Lsy;IB)V")
    public void method4493(class478 arg0, int arg1) {
        this.field2849 = arg1;
        this.field2841 = arg0.method7950();
        this.field2842 = arg0.method7950();
        this.field2845 = new class304(arg0.method7908());
        this.field2852 = arg0.method7908();
        arg0.method7909();
        this.field2850 = arg0.method7909() == 1;
        this.field2844 = arg0.method7909();
        int var3 = arg0.method7909();
        this.field2840 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2840.add(this.method4483(arg0));
        }
        this.method4476();
    }

    @ObfuscatedName("jw.al(Lsy;I)Lkd;")
    public class265 method4483(class478 arg0) {
        int var2 = arg0.method7909();
        class253 var3 = (class253) class354.method5197(class253.method4752(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2939) {
            case 0:
                var5 = new class249();
                break;
            case 1:
                var5 = new class262();
                break;
            case 2:
                var5 = new class252();
                break;
            case 3:
                var5 = new class244();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class265) var5).method4448(arg0);
        return (class265) var5;
    }

    @ObfuscatedName("jw.ac(IIII)Z")
    public boolean method4517(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2840.iterator();
        class265 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class265) var4.next();
        } while (!var5.method4445(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("jw.ab(III)Z")
    public boolean method4527(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2846 || var3 > this.field2847) {
            return false;
        } else if (var4 >= this.field2848 && var4 <= this.field2843) {
            Iterator var5 = this.field2840.iterator();
            class265 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class265) var5.next();
            } while (!var6.method4468(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jw.an(IIII)[I")
    public int[] method4474(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2840.iterator();
        class265 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class265) var4.next();
        } while (!var5.method4445(arg0, arg1, arg2));
        return var5.method4454(arg0, arg1, arg2);
    }

    @ObfuscatedName("jw.ao(III)Llt;")
    public class304 method4510(int arg0, int arg1) {
        Iterator var3 = this.field2840.iterator();
        class265 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class265) var3.next();
        } while (!var4.method4468(arg0, arg1));
        return var4.method4443(arg0, arg1);
    }

    @ObfuscatedName("jw.av(I)V")
    public void method4476() {
        Iterator var1 = this.field2840.iterator();
        while (var1.hasNext()) {
            class265 var2 = (class265) var1.next();
            var2.method4444(this);
        }
    }

    @ObfuscatedName("jw.aq(B)I")
    public int method4477() {
        return this.field2849;
    }

    @ObfuscatedName("jw.ap(I)Z")
    public boolean method4507() {
        return this.field2850;
    }

    @ObfuscatedName("jw.ar(B)Ljava/lang/String;")
    public String method4479() {
        return this.field2841;
    }

    @ObfuscatedName("jw.ak(B)Ljava/lang/String;")
    public String method4480() {
        return this.field2842;
    }

    @ObfuscatedName("jw.ax(I)I")
    public int method4513() {
        return this.field2852;
    }

    @ObfuscatedName("jw.as(I)I")
    public int method4482() {
        return this.field2844;
    }

    @ObfuscatedName("jw.ay(B)I")
    public int method4533() {
        return this.field2846;
    }

    @ObfuscatedName("jw.am(I)I")
    public int method4484() {
        return this.field2847;
    }

    @ObfuscatedName("jw.az(S)I")
    public int method4500() {
        return this.field2848;
    }

    @ObfuscatedName("jw.ae(I)I")
    public int method4495() {
        return this.field2843;
    }

    @ObfuscatedName("jw.au(I)I")
    public int method4487() {
        return this.field2845.field3429;
    }

    @ObfuscatedName("jw.ag(B)I")
    public int method4488() {
        return this.field2845.field3434;
    }

    @ObfuscatedName("jw.at(B)I")
    public int method4489() {
        return this.field2845.field3431;
    }

    @ObfuscatedName("jw.af(I)Llt;")
    public class304 method4494() {
        return new class304(this.field2845);
    }
}
