package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("jm")
public class class248 {

    @ObfuscatedName("jm.aq")
    public int field2575 = -1;

    @ObfuscatedName("jm.ad")
    public String field2573;

    @ObfuscatedName("jm.ag")
    public String field2574;

    @ObfuscatedName("jm.ak")
    public int field2572 = -1;

    @ObfuscatedName("jm.ap")
    public int field2584 = -16777216;

    @ObfuscatedName("jm.an")
    public int field2577 = -1;

    @ObfuscatedName("jm.aj")
    public class348 field2578 = null;

    @ObfuscatedName("jm.av")
    public int field2580 = Integer.MAX_VALUE;

    @ObfuscatedName("jm.ab")
    public int field2576 = 0;

    @ObfuscatedName("jm.ai")
    public int field2581 = Integer.MAX_VALUE;

    @ObfuscatedName("jm.ae")
    public int field2582 = 0;

    @ObfuscatedName("jm.au")
    public boolean field2583 = false;

    @ObfuscatedName("jm.ah")
    public LinkedList field2585;

    @ObfuscatedName("jm.aq(Lvp;IS)V")
    public void method4289(class547 arg0, int arg1) {
        this.field2575 = arg1;
        this.field2573 = arg0.method8739();
        this.field2574 = arg0.method8739();
        this.field2578 = new class348(arg0.method8734());
        this.field2572 = arg0.method8734();
        this.field2584 = arg0.method8734();
        arg0.method8804();
        this.field2583 = arg0.method8804() == 1;
        this.field2577 = arg0.method8804();
        int var3 = arg0.method8804();
        this.field2585 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2585.add(this.method4263(arg0));
        }
        this.method4312();
    }

    @ObfuscatedName("jm.ad(Lvp;I)Lkd;")
    public class268 method4263(class547 arg0) {
        int var2 = arg0.method8804();
        class256[] var3 = new class256[] { class256.field2662, class256.field2661, class256.field2660, class256.field2659 };
        class256 var4 = (class256) class402.method3799(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field2663) {
            case 0:
                var6 = new class252();
                break;
            case 1:
                var6 = new class265();
                break;
            case 2:
                var6 = new class247();
                break;
            case 3:
                var6 = new class255();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class268) var6).method4259(arg0);
        return (class268) var6;
    }

    @ObfuscatedName("jm.ag(IIIB)Z")
    public boolean method4269(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2585.iterator();
        class268 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class268) var4.next();
        } while (!var5.method4239(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("jm.ak(III)Z")
    public boolean method4265(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2580 || var3 > this.field2576) {
            return false;
        } else if (var4 >= this.field2581 && var4 <= this.field2582) {
            Iterator var5 = this.field2585.iterator();
            class268 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class268) var5.next();
            } while (!var6.method4240(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jm.ap(IIII)[I")
    public int[] method4266(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2585.iterator();
        class268 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class268) var4.next();
        } while (!var5.method4239(arg0, arg1, arg2));
        return var5.method4241(arg0, arg1, arg2);
    }

    @ObfuscatedName("jm.an(III)Lnl;")
    public class348 method4267(int arg0, int arg1) {
        Iterator var3 = this.field2585.iterator();
        class268 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class268) var3.next();
        } while (!var4.method4240(arg0, arg1));
        return var4.method4243(arg0, arg1);
    }

    @ObfuscatedName("jm.aj(I)V")
    public void method4312() {
        Iterator var1 = this.field2585.iterator();
        while (var1.hasNext()) {
            class268 var2 = (class268) var1.next();
            var2.method4238(this);
        }
    }

    @ObfuscatedName("jm.av(I)I")
    public int method4282() {
        return this.field2575;
    }

    @ObfuscatedName("jm.ab(I)Z")
    public boolean method4270() {
        return this.field2583;
    }

    @ObfuscatedName("jm.ai(B)Ljava/lang/String;")
    public String method4271() {
        return this.field2573;
    }

    @ObfuscatedName("jm.ae(B)Ljava/lang/String;")
    public String method4272() {
        return this.field2574;
    }

    @ObfuscatedName("jm.au(I)I")
    public int method4319() {
        return this.field2572;
    }

    @ObfuscatedName("jm.ah(I)I")
    public int method4333() {
        return this.field2584;
    }

    @ObfuscatedName("jm.az(B)I")
    public int method4275() {
        return this.field2577;
    }

    @ObfuscatedName("jm.ax(I)I")
    public int method4281() {
        return this.field2580;
    }

    @ObfuscatedName("jm.ac(I)I")
    public int method4277() {
        return this.field2576;
    }

    @ObfuscatedName("jm.al(I)I")
    public int method4278() {
        return this.field2581;
    }

    @ObfuscatedName("jm.ay(S)I")
    public int method4298() {
        return this.field2582;
    }

    @ObfuscatedName("jm.ao(I)I")
    public int method4280() {
        return this.field2578.field3733;
    }

    @ObfuscatedName("jm.aa(I)I")
    public int method4303() {
        return this.field2578.field3734;
    }

    @ObfuscatedName("jm.as(B)I")
    public int method4268() {
        return this.field2578.field3735;
    }

    @ObfuscatedName("jm.aw(B)Lnl;")
    public class348 method4283() {
        return new class348(this.field2578);
    }
}
