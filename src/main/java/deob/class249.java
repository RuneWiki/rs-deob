package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("js")
public class class249 {

    @ObfuscatedName("js.af")
    public int field2900 = -1;

    @ObfuscatedName("js.an")
    public String field2890;

    @ObfuscatedName("js.aw")
    public String field2891;

    @ObfuscatedName("js.ac")
    public int field2892 = -1;

    @ObfuscatedName("js.au")
    public int field2893 = -1;

    @ObfuscatedName("js.ab")
    public class308 field2896 = null;

    @ObfuscatedName("js.aq")
    public int field2895 = Integer.MAX_VALUE;

    @ObfuscatedName("js.al")
    public int field2889 = 0;

    @ObfuscatedName("js.at")
    public int field2897 = Integer.MAX_VALUE;

    @ObfuscatedName("js.aa")
    public int field2898 = 0;

    @ObfuscatedName("js.ay")
    public boolean field2899 = false;

    @ObfuscatedName("js.ao")
    public LinkedList field2894;

    @ObfuscatedName("js.af(Lsg;IB)V")
    public void method4695(class489 arg0, int arg1) {
        this.field2900 = arg1;
        this.field2890 = arg0.method8259();
        this.field2891 = arg0.method8259();
        this.field2896 = new class308(arg0.method8254());
        this.field2892 = arg0.method8254();
        arg0.method8248();
        this.field2899 = arg0.method8248() == 1;
        this.field2893 = arg0.method8248();
        int var3 = arg0.method8248();
        this.field2894 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2894.add(this.method4694(arg0));
        }
        this.method4699();
    }

    @ObfuscatedName("js.an(Lsg;I)Lkw;")
    public class269 method4694(class489 arg0) {
        int var2 = arg0.method8248();
        class257 var3 = (class257) Statics.method3600(class257.method4950(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2979) {
            case 0:
                var5 = new class266();
                break;
            case 1:
                var5 = new class248();
                break;
            case 2:
                var5 = new class253();
                break;
            case 3:
                var5 = new class256();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class269) var5).method4689(arg0);
        return (class269) var5;
    }

    @ObfuscatedName("js.aw(IIII)Z")
    public boolean method4751(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2894.iterator();
        class269 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class269) var4.next();
        } while (!var5.method4668(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("js.ac(III)Z")
    public boolean method4696(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2895 || var3 > this.field2889) {
            return false;
        } else if (var4 >= this.field2897 && var4 <= this.field2898) {
            Iterator var5 = this.field2894.iterator();
            class269 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class269) var5.next();
            } while (!var6.method4673(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("js.au(IIIB)[I")
    public int[] method4746(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2894.iterator();
        class269 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class269) var4.next();
        } while (!var5.method4668(arg0, arg1, arg2));
        return var5.method4688(arg0, arg1, arg2);
    }

    @ObfuscatedName("js.ab(III)Llb;")
    public class308 method4698(int arg0, int arg1) {
        Iterator var3 = this.field2894.iterator();
        class269 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class269) var3.next();
        } while (!var4.method4673(arg0, arg1));
        return var4.method4671(arg0, arg1);
    }

    @ObfuscatedName("js.aq(I)V")
    public void method4699() {
        Iterator var1 = this.field2894.iterator();
        while (var1.hasNext()) {
            class269 var2 = (class269) var1.next();
            var2.method4667(this);
        }
    }

    @ObfuscatedName("js.al(I)I")
    public int method4740() {
        return this.field2900;
    }

    @ObfuscatedName("js.at(I)Z")
    public boolean method4701() {
        return this.field2899;
    }

    @ObfuscatedName("js.aa(I)Ljava/lang/String;")
    public String method4744() {
        return this.field2890;
    }

    @ObfuscatedName("js.ay(S)Ljava/lang/String;")
    public String method4703() {
        return this.field2891;
    }

    @ObfuscatedName("js.ao(I)I")
    public int method4722() {
        return this.field2892;
    }

    @ObfuscatedName("js.ax(I)I")
    public int method4702() {
        return this.field2893;
    }

    @ObfuscatedName("js.ai(I)I")
    public int method4706() {
        return this.field2895;
    }

    @ObfuscatedName("js.ag(I)I")
    public int method4707() {
        return this.field2889;
    }

    @ObfuscatedName("js.ah(I)I")
    public int method4747() {
        return this.field2897;
    }

    @ObfuscatedName("js.av(I)I")
    public int method4693() {
        return this.field2898;
    }

    @ObfuscatedName("js.ar(B)I")
    public int method4705() {
        return this.field2896.field3486;
    }

    @ObfuscatedName("js.am(I)I")
    public int method4708() {
        return this.field2896.field3487;
    }

    @ObfuscatedName("js.as(I)I")
    public int method4711() {
        return this.field2896.field3488;
    }

    @ObfuscatedName("js.aj(B)Llb;")
    public class308 method4712() {
        return new class308(this.field2896);
    }
}
