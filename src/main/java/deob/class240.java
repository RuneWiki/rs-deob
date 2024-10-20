package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("jr")
public class class240 {

    @ObfuscatedName("jr.am")
    public int field2519 = -1;

    @ObfuscatedName("jr.ap")
    public String field2507;

    @ObfuscatedName("jr.af")
    public String field2508;

    @ObfuscatedName("jr.aj")
    public int field2509 = -1;

    @ObfuscatedName("jr.aq")
    public int field2506 = -16777216;

    @ObfuscatedName("jr.ar")
    public int field2511 = -1;

    @ObfuscatedName("jr.ag")
    public class337 field2512 = null;

    @ObfuscatedName("jr.ao")
    public int field2513 = Integer.MAX_VALUE;

    @ObfuscatedName("jr.ae")
    public int field2514 = 0;

    @ObfuscatedName("jr.aa")
    public int field2515 = Integer.MAX_VALUE;

    @ObfuscatedName("jr.au")
    public int field2516 = 0;

    @ObfuscatedName("jr.an")
    public boolean field2510 = false;

    @ObfuscatedName("jr.ad")
    public LinkedList field2518;

    @ObfuscatedName("jr.am(Luk;II)V")
    public void method4265(class531 arg0, int arg1) {
        this.field2519 = arg1;
        this.field2507 = arg0.method8641();
        this.field2508 = arg0.method8641();
        this.field2512 = new class337(arg0.method8566());
        this.field2509 = arg0.method8566();
        this.field2506 = arg0.method8566();
        arg0.method8561();
        this.field2510 = arg0.method8561() == 1;
        this.field2511 = arg0.method8561();
        int var3 = arg0.method8561();
        this.field2518 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2518.add(this.method4266(arg0));
        }
        this.method4271();
    }

    @ObfuscatedName("jr.ap(Luk;I)Ljd;")
    public class260 method4266(class531 arg0) {
        int var2 = arg0.method8561();
        class248 var3 = (class248) class389.method6514(Statics.method4539(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2600) {
            case 0:
                var5 = new class257();
                break;
            case 1:
                var5 = new class247();
                break;
            case 2:
                var5 = new class244();
                break;
            case 3:
                var5 = new class239();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class260) var5).method4251(arg0);
        return (class260) var5;
    }

    @ObfuscatedName("jr.af(IIIB)Z")
    public boolean method4267(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2518.iterator();
        class260 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class260) var4.next();
        } while (!var5.method4243(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("jr.aj(III)Z")
    public boolean method4277(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2513 || var3 > this.field2514) {
            return false;
        } else if (var4 >= this.field2515 && var4 <= this.field2516) {
            Iterator var5 = this.field2518.iterator();
            class260 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class260) var5.next();
            } while (!var6.method4245(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jr.aq(IIIB)[I")
    public int[] method4269(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2518.iterator();
        class260 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class260) var4.next();
        } while (!var5.method4243(arg0, arg1, arg2));
        return var5.method4248(arg0, arg1, arg2);
    }

    @ObfuscatedName("jr.ar(IIB)Lmu;")
    public class337 method4319(int arg0, int arg1) {
        Iterator var3 = this.field2518.iterator();
        class260 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class260) var3.next();
        } while (!var4.method4245(arg0, arg1));
        return var4.method4247(arg0, arg1);
    }

    @ObfuscatedName("jr.ag(I)V")
    public void method4271() {
        Iterator var1 = this.field2518.iterator();
        while (var1.hasNext()) {
            class260 var2 = (class260) var1.next();
            var2.method4261(this);
        }
    }

    @ObfuscatedName("jr.ao(I)I")
    public int method4272() {
        return this.field2519;
    }

    @ObfuscatedName("jr.ae(I)Z")
    public boolean method4273() {
        return this.field2510;
    }

    @ObfuscatedName("jr.aa(I)Ljava/lang/String;")
    public String method4274() {
        return this.field2507;
    }

    @ObfuscatedName("jr.au(B)Ljava/lang/String;")
    public String method4264() {
        return this.field2508;
    }

    @ObfuscatedName("jr.an(I)I")
    public int method4276() {
        return this.field2509;
    }

    @ObfuscatedName("jr.ad(I)I")
    public int method4303() {
        return this.field2506;
    }

    @ObfuscatedName("jr.ax(I)I")
    public int method4302() {
        return this.field2511;
    }

    @ObfuscatedName("jr.aw(B)I")
    public int method4279() {
        return this.field2513;
    }

    @ObfuscatedName("jr.az(I)I")
    public int method4280() {
        return this.field2514;
    }

    @ObfuscatedName("jr.av(I)I")
    public int method4281() {
        return this.field2515;
    }

    @ObfuscatedName("jr.ak(I)I")
    public int method4282() {
        return this.field2516;
    }

    @ObfuscatedName("jr.ay(B)I")
    public int method4268() {
        return this.field2512.field3604;
    }

    @ObfuscatedName("jr.as(I)I")
    public int method4284() {
        return this.field2512.field3605;
    }

    @ObfuscatedName("jr.ab(I)I")
    public int method4285() {
        return this.field2512.field3603;
    }

    @ObfuscatedName("jr.ah(I)Lmu;")
    public class337 method4286() {
        return new class337(this.field2512);
    }
}
