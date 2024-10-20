package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("ai")
public class class27 {

    @ObfuscatedName("ai.p")
    public int field586;

    @ObfuscatedName("ai.g")
    public class103 field575;

    @ObfuscatedName("ai.x")
    public DataInputStream field591;

    @ObfuscatedName("ai.q")
    public byte[] field577 = new byte[4];

    @ObfuscatedName("ai.d")
    public int field576;

    @ObfuscatedName("ai.k")
    public byte[] field574;

    @ObfuscatedName("ai.j")
    public int field580;

    @ObfuscatedName("ai.s")
    public long field581;

    public class27(class104 arg0, URL arg1) {
        this.field575 = arg0.method1825(arg1);
        this.field586 = 0;
        this.field581 = class156.method1597() + 30000L;
    }

    @ObfuscatedName("ai.p(I)[B")
    public byte[] method579() throws IOException {
        if (class156.method1597() > this.field581) {
            throw new IOException();
        }
        if (this.field586 == 0) {
            if (this.field575.field1668 == 2) {
                throw new IOException();
            }
            if (this.field575.field1668 == 1) {
                this.field591 = (DataInputStream) this.field575.field1665;
                this.field586 = 1;
            }
        }
        if (this.field586 == 1) {
            int var1 = this.field591.available();
            if (var1 > 0) {
                if (this.field576 + var1 > 4) {
                    var1 = 4 - this.field576;
                }
                this.field576 += this.field591.read(this.field577, this.field576, var1);
                if (this.field576 == 4) {
                    int var2 = (new class154(this.field577)).method2598();
                    this.field574 = new byte[var2];
                    this.field586 = 2;
                }
            }
        }
        if (this.field586 == 2) {
            int var3 = this.field591.available();
            if (var3 > 0) {
                if (this.field580 + var3 > this.field574.length) {
                    var3 = this.field574.length - this.field580;
                }
                this.field580 += this.field591.read(this.field574, this.field580, var3);
                if (this.field580 == this.field574.length) {
                    return this.field574;
                }
            }
        }
        return null;
    }
}
