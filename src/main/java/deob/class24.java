package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("t")
public class class24 {

    @ObfuscatedName("t.p")
    public int field381;

    @ObfuscatedName("t.i")
    public byte[] field373 = new byte[4];

    @ObfuscatedName("t.o")
    public class79 field370;

    @ObfuscatedName("t.n")
    public DataInputStream field371;

    @ObfuscatedName("t.l")
    public int field376;

    @ObfuscatedName("t.v")
    public byte[] field374;

    @ObfuscatedName("t.g")
    public int field375;

    @ObfuscatedName("t.x")
    public long field386;

    public class24(class74 arg0, URL arg1) {
        this.field370 = arg0.method1545(arg1);
        this.field381 = 0;
        this.field386 = class121.method711() + 30000L;
    }

    @ObfuscatedName("t.p(B)[B")
    public byte[] method220() throws IOException {
        if (class121.method711() > this.field386) {
            throw new IOException();
        }
        if (this.field381 == 0) {
            if (this.field370.field1413 == 2) {
                throw new IOException();
            }
            if (this.field370.field1413 == 1) {
                this.field371 = (DataInputStream) this.field370.field1412;
                this.field381 = 1;
            }
        }
        if (this.field381 == 1) {
            int var1 = this.field371.available();
            if (var1 > 0) {
                if (this.field376 + var1 > 4) {
                    var1 = 4 - this.field376;
                }
                this.field376 += this.field371.read(this.field373, this.field376, var1);
                if (this.field376 == 4) {
                    int var2 = (new class127(this.field373)).method2551();
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
