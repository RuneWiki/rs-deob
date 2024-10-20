package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("v")
public class class23 {

    @ObfuscatedName("v.g")
    public int field374;

    @ObfuscatedName("v.e")
    public class78 field365;

    @ObfuscatedName("v.n")
    public DataInputStream field366;

    @ObfuscatedName("v.j")
    public byte[] field368 = new byte[4];

    @ObfuscatedName("v.i")
    public int field369;

    @ObfuscatedName("v.o")
    public byte[] field373;

    @ObfuscatedName("v.l")
    public int field371;

    @ObfuscatedName("v.p")
    public long field372;

    public class23(class73 arg0, URL arg1) {
        this.field365 = arg0.method1484(arg1);
        this.field374 = 0;
        this.field372 = class120.method8() + 30000L;
    }

    @ObfuscatedName("v.g(I)[B")
    public byte[] method205() throws IOException {
        if (class120.method8() > this.field372) {
            throw new IOException();
        }
        if (this.field374 == 0) {
            if (this.field365.field1398 == 2) {
                throw new IOException();
            }
            if (this.field365.field1398 == 1) {
                this.field366 = (DataInputStream) this.field365.field1402;
                this.field374 = 1;
            }
        }
        if (this.field374 == 1) {
            int var1 = this.field366.available();
            if (var1 > 0) {
                if (this.field369 + var1 > 4) {
                    var1 = 4 - this.field369;
                }
                this.field369 += this.field366.read(this.field368, this.field369, var1);
                if (this.field369 == 4) {
                    int var2 = (new class126(this.field368)).method2593();
                    this.field373 = new byte[var2];
                    this.field374 = 2;
                }
            }
        }
        if (this.field374 == 2) {
            int var3 = this.field366.available();
            if (var3 > 0) {
                if (this.field371 + var3 > this.field373.length) {
                    var3 = this.field373.length - this.field371;
                }
                this.field371 += this.field366.read(this.field373, this.field371, var3);
                if (this.field371 == this.field373.length) {
                    return this.field373;
                }
            }
        }
        return null;
    }
}
