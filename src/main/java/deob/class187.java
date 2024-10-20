package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("gz")
public class class187 extends class166 {

    @ObfuscatedName("gz.o")
    public HashSet field2142;

    @ObfuscatedName("gz.c")
    public HashSet field2139;

    @ObfuscatedName("gz.e")
    public List field2141;

    @ObfuscatedName("gz.ba(Lnd;Lnd;IZI)V")
    public void method3355(class383 arg0, class383 arg1, int arg2, boolean arg3) {
        this.method3019(arg0, arg2);
        int var5 = arg1.method5967();
        this.field2142 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class161 var7 = new class161();
            try {
                var7.method2949(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2142.add(var7);
        }
        int var9 = arg1.method5967();
        this.field2139 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class169 var11 = new class169();
            try {
                var11.method3277(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2139.add(var11);
        }
        this.method3361(arg1, arg3);
    }

    @ObfuscatedName("gz.be(Lnd;ZI)V")
    public void method3361(class383 arg0, boolean arg1) {
        this.field2141 = new LinkedList();
        int var3 = arg0.method5967();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5982();
            class243 var6 = new class243(arg0.method5970());
            boolean var7 = arg0.method5965() == 1;
            if (arg1 || !var7) {
                this.field2141.add(new class172((class243) null, var6, var5, (class179) null));
            }
        }
    }
}
