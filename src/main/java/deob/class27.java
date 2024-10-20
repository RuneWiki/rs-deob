package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("aj")
public class class27 {

    @ObfuscatedName("aj.u")
    public int field597;

    @ObfuscatedName("aj.x")
    public class103 field588;

    @ObfuscatedName("aj.i")
    public byte[] field590 = new byte[4];

    @ObfuscatedName("aj.a")
    public DataInputStream field589;

    @ObfuscatedName("aj.f")
    public int field593;

    @ObfuscatedName("aj.c")
    public byte[] field592;

    @ObfuscatedName("aj.d")
    public int field587;

    @ObfuscatedName("aj.l")
    public long field594;

    public class27(class104 arg0, URL arg1) {
        this.field588 = arg0.method1817(arg1);
        this.field597 = 0;
        this.field594 = class156.method118() + 30000L;
    }

    @ObfuscatedName("aj.u(B)[B")
    public byte[] method596() throws IOException {
        if (class156.method118() > this.field594) {
            throw new IOException();
        }
        if (this.field597 == 0) {
            if (this.field588.field1649 == 2) {
                throw new IOException();
            }
            if (this.field588.field1649 == 1) {
                this.field589 = (DataInputStream) this.field588.field1653;
                this.field597 = 1;
            }
        }
        if (this.field597 == 1) {
            int var1 = this.field589.available();
            if (var1 > 0) {
                if (this.field593 + var1 > 4) {
                    var1 = 4 - this.field593;
                }
                this.field593 += this.field589.read(this.field590, this.field593, var1);
                if (this.field593 == 4) {
                    int var2 = (new class154(this.field590)).method2593();
                    this.field592 = new byte[var2];
                    this.field597 = 2;
                }
            }
        }
        if (this.field597 == 2) {
            int var3 = this.field589.available();
            if (var3 > 0) {
                if (this.field587 + var3 > this.field592.length) {
                    var3 = this.field592.length - this.field587;
                }
                this.field587 += this.field589.read(this.field592, this.field587, var3);
                if (this.field587 == this.field592.length) {
                    return this.field592;
                }
            }
        }
        return null;
    }
}
