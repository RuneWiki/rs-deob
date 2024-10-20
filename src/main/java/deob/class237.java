package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("jv")
public class class237 {

    @ObfuscatedName("jv.at")
    public int field2466 = -1;

    @ObfuscatedName("jv.ah")
    public String field2469;

    @ObfuscatedName("jv.ar")
    public String field2465;

    @ObfuscatedName("jv.ao")
    public int field2464 = -1;

    @ObfuscatedName("jv.ab")
    public int field2467 = -16777216;

    @ObfuscatedName("jv.au")
    public int field2468 = -1;

    @ObfuscatedName("jv.aa")
    public class334 field2473 = null;

    @ObfuscatedName("jv.ac")
    public int field2470 = Integer.MAX_VALUE;

    @ObfuscatedName("jv.al")
    public int field2471 = 0;

    @ObfuscatedName("jv.az")
    public int field2472 = Integer.MAX_VALUE;

    @ObfuscatedName("jv.ap")
    public int field2475 = 0;

    @ObfuscatedName("jv.av")
    public boolean field2474 = false;

    @ObfuscatedName("jv.ax")
    public LinkedList field2463;

    @ObfuscatedName("jv.at(Luj;IZI)V")
    public void method4170(class527 arg0, int arg1, boolean arg2) {
        this.field2466 = arg1;
        this.field2469 = arg0.method8535();
        this.field2465 = arg0.method8535();
        this.field2473 = new class334(arg0.method8416());
        this.field2464 = arg0.method8416();
        if (arg2) {
            this.field2467 = arg0.method8416();
        }
        arg0.method8410();
        this.field2474 = arg0.method8410() == 1;
        this.field2468 = arg0.method8410();
        int var4 = arg0.method8410();
        this.field2463 = new LinkedList();
        for (int var5 = 0; var5 < var4; var5++) {
            this.field2463.add(this.method4224(arg0));
        }
        this.method4176();
    }

    @ObfuscatedName("jv.ah(Luj;B)Ljj;")
    public class257 method4224(class527 arg0) {
        int var2 = arg0.method8410();
        class245 var3 = (class245) class385.method164(class245.method4430(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2553) {
            case 0:
                var5 = new class236();
                break;
            case 1:
                var5 = new class254();
                break;
            case 2:
                var5 = new class241();
                break;
            case 3:
                var5 = new class244();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class257) var5).method4143(arg0);
        return (class257) var5;
    }

    @ObfuscatedName("jv.ar(IIII)Z")
    public boolean method4172(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2463.iterator();
        class257 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class257) var4.next();
        } while (!var5.method4140(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("jv.ao(IIB)Z")
    public boolean method4198(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2470 || var3 > this.field2471) {
            return false;
        } else if (var4 >= this.field2472 && var4 <= this.field2475) {
            Iterator var5 = this.field2463.iterator();
            class257 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class257) var5.next();
            } while (!var6.method4141(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jv.ab(IIIB)[I")
    public int[] method4208(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2463.iterator();
        class257 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class257) var4.next();
        } while (!var5.method4140(arg0, arg1, arg2));
        return var5.method4142(arg0, arg1, arg2);
    }

    @ObfuscatedName("jv.au(III)Lmh;")
    public class334 method4175(int arg0, int arg1) {
        Iterator var3 = this.field2463.iterator();
        class257 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class257) var3.next();
        } while (!var4.method4141(arg0, arg1));
        return var4.method4155(arg0, arg1);
    }

    @ObfuscatedName("jv.aa(I)V")
    public void method4176() {
        Iterator var1 = this.field2463.iterator();
        while (var1.hasNext()) {
            class257 var2 = (class257) var1.next();
            var2.method4150(this);
        }
    }

    @ObfuscatedName("jv.ac(B)I")
    public int method4177() {
        return this.field2466;
    }

    @ObfuscatedName("jv.al(I)Z")
    public boolean method4178() {
        return this.field2474;
    }

    @ObfuscatedName("jv.az(I)Ljava/lang/String;")
    public String method4244() {
        return this.field2469;
    }

    @ObfuscatedName("jv.ap(I)Ljava/lang/String;")
    public String method4180() {
        return this.field2465;
    }

    @ObfuscatedName("jv.av(B)I")
    public int method4196() {
        return this.field2464;
    }

    @ObfuscatedName("jv.ax(I)I")
    public int method4243() {
        return this.field2467;
    }

    @ObfuscatedName("jv.as(I)I")
    public int method4183() {
        return this.field2468;
    }

    @ObfuscatedName("jv.ay(I)I")
    public int method4246() {
        return this.field2470;
    }

    @ObfuscatedName("jv.ak(B)I")
    public int method4184() {
        return this.field2471;
    }

    @ObfuscatedName("jv.aj(I)I")
    public int method4185() {
        return this.field2472;
    }

    @ObfuscatedName("jv.am(I)I")
    public int method4186() {
        return this.field2475;
    }

    @ObfuscatedName("jv.aq(I)I")
    public int method4187() {
        return this.field2473.field3561;
    }

    @ObfuscatedName("jv.ai(S)I")
    public int method4188() {
        return this.field2473.field3562;
    }

    @ObfuscatedName("jv.aw(I)I")
    public int method4189() {
        return this.field2473.field3563;
    }

    @ObfuscatedName("jv.ae(B)Lmh;")
    public class334 method4190() {
        return new class334(this.field2473);
    }
}
