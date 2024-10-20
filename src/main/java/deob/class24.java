package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("f")
public class class24 {

    @ObfuscatedName("f.l")
    public int field386;

    @ObfuscatedName("f.b")
    public class79 field370;

    @ObfuscatedName("f.o")
    public DataInputStream field369;

    @ObfuscatedName("f.w")
    public byte[] field372 = new byte[4];

    @ObfuscatedName("f.r")
    public int field371;

    @ObfuscatedName("f.k")
    public byte[] field381;

    @ObfuscatedName("f.z")
    public int field375;

    @ObfuscatedName("f.g")
    public long field376;

    public class24(class74 arg0, URL arg1) {
        this.field370 = arg0.method1509(arg1);
        this.field386 = 0;
        this.field376 = class121.method1435() + 30000L;
    }

    @ObfuscatedName("f.l(B)[B")
    public byte[] method228() throws IOException {
        if (class121.method1435() > this.field376) {
            throw new IOException();
        }
        if (this.field386 == 0) {
            if (this.field370.field1397 == 2) {
                throw new IOException();
            }
            if (this.field370.field1397 == 1) {
                this.field369 = (DataInputStream) this.field370.field1395;
                this.field386 = 1;
            }
        }
        if (this.field386 == 1) {
            int var1 = this.field369.available();
            if (var1 > 0) {
                if (this.field371 + var1 > 4) {
                    var1 = 4 - this.field371;
                }
                this.field371 += this.field369.read(this.field372, this.field371, var1);
                if (this.field371 == 4) {
                    int var2 = (new class127(this.field372)).method2586();
                    this.field381 = new byte[var2];
                    this.field386 = 2;
                }
            }
        }
        if (this.field386 == 2) {
            int var3 = this.field369.available();
            if (var3 > 0) {
                if (this.field375 + var3 > this.field381.length) {
                    var3 = this.field381.length - this.field375;
                }
                this.field375 += this.field369.read(this.field381, this.field375, var3);
                if (this.field375 == this.field381.length) {
                    return this.field381;
                }
            }
        }
        return null;
    }
}
