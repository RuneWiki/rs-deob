package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ip")
public class class239 extends class218 {

    @ObfuscatedName("ip.h")
    public HashSet field2798;

    @ObfuscatedName("ip.q")
    public HashSet field2800;

    @ObfuscatedName("ip.x")
    public List field2799;

    @ObfuscatedName("ip.bj(Lpi;Lpi;IZI)V")
    public void method4379(class421 arg0, class421 arg1, int arg2, boolean arg3) {
        this.method4027(arg0, arg2);
        int var5 = arg1.method6666();
        this.field2798 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class213 var7 = new class213();
            try {
                var7.method3951(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2798.add(var7);
        }
        int var9 = arg1.method6666();
        this.field2800 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class221 var11 = new class221();
            try {
                var11.method4271(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2800.add(var11);
        }
        this.method4383(arg1, arg3);
    }

    @ObfuscatedName("ip.bo(Lpi;ZI)V")
    public void method4383(class421 arg0, boolean arg1) {
        this.field2799 = new LinkedList();
        int var3 = arg0.method6666();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method6649();
            class282 var6 = new class282(arg0.method6669());
            boolean var7 = arg0.method6686() == 1;
            if (arg1 || !var7) {
                this.field2799.add(new class224((class282) null, var6, var5, (class231) null));
            }
        }
    }
}
