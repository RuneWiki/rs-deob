package deob;

import java.util.HashMap;
import java.util.Iterator;

@ObfuscatedName("dy")
public class class98 implements Iterable {

    @ObfuscatedName("dy.ap")
    public class104 field1192;

    @ObfuscatedName("dy.aw")
    public final class530 field1191 = new class530(16);

    @ObfuscatedName("dy.ak")
    public int field1194 = 0;

    @ObfuscatedName("dy.aj")
    public final HashMap field1193 = new HashMap(16);

    @ObfuscatedName("dy.ai")
    public final HashMap field1197 = new HashMap(16);

    @ObfuscatedName("dy.ay")
    public class493 field1190 = class493.field5090;

    @ObfuscatedName("dy.as")
    public class492 field1196 = class492.field5084;

    @ObfuscatedName("dy.ap(IIII)Ldn;")
    public class104 method2573(int arg0, int arg1, int arg2) {
        this.field1192 = this.method2590(-1, arg0, arg1, arg2, class233.field2471);
        return this.field1192;
    }

    @ObfuscatedName("dy.aw(IIIILim;I)Ldn;")
    public class104 method2590(int arg0, int arg1, int arg2, int arg3, class233 arg4) {
        class104 var6 = new class104(arg0, arg1, arg2, arg3, arg4);
        this.field1191.method8970(var6, (long) arg0);
        this.field1194++;
        return var6;
    }

    @ObfuscatedName("dy.ak(Ldn;I)V")
    public void method2606(class104 arg0) {
        if (arg0 != null) {
            this.field1193.remove(arg0.field1354);
            this.field1197.remove(arg0.field1354);
            arg0.method8667();
            this.field1194--;
        }
    }

    @ObfuscatedName("dy.aj(I)Ldn;")
    public class104 method2576() {
        return this.field1192;
    }

    @ObfuscatedName("dy.ai(I)I")
    public int method2577() {
        return this.field1194;
    }

    @ObfuscatedName("dy.ay(Lsx;Lsf;I)V")
    public void method2578(class493 arg0, class492 arg1) {
        this.field1190 = arg0;
        this.field1196 = arg1;
    }

    @ObfuscatedName("dy.as(ILsx;Lsf;B)V")
    public void method2579(int arg0, class493 arg1, class492 arg2) {
        this.field1193.put(arg0, arg1);
        this.field1197.put(arg0, arg2);
    }

    @ObfuscatedName("dy.ae(IB)V")
    public void method2607(int arg0) {
        this.field1193.remove(arg0);
        this.field1197.remove(arg0);
    }

    @ObfuscatedName("dy.am(IB)Lsx;")
    public class493 method2581(int arg0) {
        class493 var2 = (class493) this.field1193.get(arg0);
        return var2 == null ? this.field1190 : var2;
    }

    @ObfuscatedName("dy.at(IB)Lsf;")
    public class492 method2582(int arg0) {
        class492 var2 = (class492) this.field1197.get(arg0);
        return var2 == null ? this.field1196 : var2;
    }

    public Iterator iterator() {
        return this.field1191.iterator();
    }

    @ObfuscatedName("dy.au(I)V")
    public void method2583() {
        this.field1191.method8963();
        this.field1194 = 0;
        this.field1193.clear();
        this.field1197.clear();
        this.field1190 = class493.field5090;
        this.field1196 = class492.field5084;
        if (this.field1192 != null) {
            this.field1192.method2834();
            this.field1191.method8970(this.field1192, -1L);
            this.field1194 = 1;
        }
    }
}
