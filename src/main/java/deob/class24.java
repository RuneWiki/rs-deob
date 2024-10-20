package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("c")
public class class24 {

    @ObfuscatedName("c.b")
    public int field381;

    @ObfuscatedName("c.e")
    public class79 field370;

    @ObfuscatedName("c.g")
    public DataInputStream field371;

    @ObfuscatedName("c.o")
    public byte[] field376 = new byte[4];

    @ObfuscatedName("c.a")
    public int field373;

    @ObfuscatedName("c.h")
    public byte[] field374;

    @ObfuscatedName("c.j")
    public int field375;

    @ObfuscatedName("c.f")
    public long field369;

    public class24(class74 arg0, URL arg1) {
        this.field370 = arg0.method1487(arg1);
        this.field381 = 0;
        this.field369 = class121.method2221() + 30000L;
    }

    @ObfuscatedName("c.b(I)[B")
    public byte[] method217() throws IOException {
        if (class121.method2221() > this.field369) {
            throw new IOException();
        }
        if (this.field381 == 0) {
            if (this.field370.field1393 == 2) {
                throw new IOException();
            }
            if (this.field370.field1393 == 1) {
                this.field371 = (DataInputStream) this.field370.field1397;
                this.field381 = 1;
            }
        }
        if (this.field381 == 1) {
            int var1 = this.field371.available();
            if (var1 > 0) {
                if (this.field373 + var1 > 4) {
                    var1 = 4 - this.field373;
                }
                this.field373 += this.field371.read(this.field376, this.field373, var1);
                if (this.field373 == 4) {
                    int var2 = (new class126(this.field376)).method2439();
                    this.field374 = new byte[var2];
                    this.field381 = 2;
                }
            }
        }
        if (this.field381 == 2) {
            int var3 = this.field371.available();
            if (var3 > 0) {
                if (this.field375 + var3 > this.field374.length) {
                    var3 = this.field374.length - this.field375;
                }
                this.field375 += this.field371.read(this.field374, this.field375, var3);
                if (this.field375 == this.field374.length) {
                    return this.field374;
                }
            }
        }
        return null;
    }
}
