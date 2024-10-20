package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("ak")
public class class27 {

    @ObfuscatedName("ak.i")
    public byte[] field598 = new byte[4];

    @ObfuscatedName("ak.e")
    public int field588;

    @ObfuscatedName("ak.f")
    public class103 field589;

    @ObfuscatedName("ak.k")
    public DataInputStream field590;

    @ObfuscatedName("ak.g")
    public int field592;

    @ObfuscatedName("ak.n")
    public byte[] field593;

    @ObfuscatedName("ak.a")
    public int field594;

    @ObfuscatedName("ak.q")
    public long field591;

    public class27(class104 arg0, URL arg1) {
        this.field589 = arg0.method1817(arg1);
        this.field588 = 0;
        this.field591 = class156.method1307() + 30000L;
    }

    @ObfuscatedName("ak.i(I)[B")
    public byte[] method558() throws IOException {
        if (class156.method1307() > this.field591) {
            throw new IOException();
        }
        if (this.field588 == 0) {
            if (this.field589.field1651 == 2) {
                throw new IOException();
            }
            if (this.field589.field1651 == 1) {
                this.field590 = (DataInputStream) this.field589.field1653;
                this.field588 = 1;
            }
        }
        if (this.field588 == 1) {
            int var1 = this.field590.available();
            if (var1 > 0) {
                if (this.field592 + var1 > 4) {
                    var1 = 4 - this.field592;
                }
                this.field592 += this.field590.read(this.field598, this.field592, var1);
                if (this.field592 == 4) {
                    int var2 = (new class154(this.field598)).method2658();
                    this.field593 = new byte[var2];
                    this.field588 = 2;
                }
            }
        }
        if (this.field588 == 2) {
            int var3 = this.field590.available();
            if (var3 > 0) {
                if (this.field594 + var3 > this.field593.length) {
                    var3 = this.field593.length - this.field594;
                }
                this.field594 += this.field590.read(this.field593, this.field594, var3);
                if (this.field594 == this.field593.length) {
                    return this.field593;
                }
            }
        }
        return null;
    }
}
