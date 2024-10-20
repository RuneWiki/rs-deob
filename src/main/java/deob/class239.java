package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ip")
public class class239 extends class218 {

    @ObfuscatedName("ip.d")
    public HashSet field2774;

    @ObfuscatedName("ip.h")
    public HashSet field2771;

    @ObfuscatedName("ip.g")
    public List field2772;

    @ObfuscatedName("ip.bo(Lpi;Lpi;IZI)V")
    public void method4427(class419 arg0, class419 arg1, int arg2, boolean arg3) {
        this.method4078(arg0, arg2);
        int var5 = arg1.method6672();
        this.field2774 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class213 var7 = new class213();
            try {
                var7.method4001(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2774.add(var7);
        }
        int var9 = arg1.method6672();
        this.field2771 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class221 var11 = new class221();
            try {
                var11.method4310(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2771.add(var11);
        }
        this.method4428(arg1, arg3);
    }

    @ObfuscatedName("ip.bf(Lpi;ZB)V")
    public void method4428(class419 arg0, boolean arg1) {
        this.field2772 = new LinkedList();
        int var3 = arg0.method6672();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method6708();
            class277 var6 = new class277(arg0.method6675());
            boolean var7 = arg0.method6781() == 1;
            if (arg1 || !var7) {
                this.field2772.add(new class224((class277) null, var6, var5, (class231) null));
            }
        }
    }
}
