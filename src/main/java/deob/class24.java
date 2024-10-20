package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("w")
public class class24 {

    @ObfuscatedName("w.d")
    public int field374;

    @ObfuscatedName("w.g")
    public class79 field369;

    @ObfuscatedName("w.a")
    public DataInputStream field370;

    @ObfuscatedName("w.t")
    public byte[] field371 = new byte[4];

    @ObfuscatedName("w.f")
    public int field372;

    @ObfuscatedName("w.c")
    public byte[] field373;

    @ObfuscatedName("w.p")
    public int field377;

    @ObfuscatedName("w.s")
    public long field375;

    public class24(class74 arg0, URL arg1) {
        this.field369 = arg0.method1475(arg1);
        this.field374 = 0;
        this.field375 = class121.method1250() + 30000L;
    }

    @ObfuscatedName("w.d(I)[B")
    public byte[] method209() throws IOException {
        if (class121.method1250() > this.field375) {
            throw new IOException();
        }
        if (this.field374 == 0) {
            if (this.field369.field1412 == 2) {
                throw new IOException();
            }
            if (this.field369.field1412 == 1) {
                this.field370 = (DataInputStream) this.field369.field1416;
                this.field374 = 1;
            }
        }
        if (this.field374 == 1) {
            int var1 = this.field370.available();
            if (var1 > 0) {
                if (this.field372 + var1 > 4) {
                    var1 = 4 - this.field372;
                }
                this.field372 += this.field370.read(this.field371, this.field372, var1);
                if (this.field372 == 4) {
                    int var2 = (new class127(this.field371)).method2405();
                    this.field373 = new byte[var2];
                    this.field374 = 2;
                }
            }
        }
        if (this.field374 == 2) {
            int var3 = this.field370.available();
            if (var3 > 0) {
                if (this.field377 + var3 > this.field373.length) {
                    var3 = this.field373.length - this.field377;
                }
                this.field377 += this.field370.read(this.field373, this.field377, var3);
                if (this.field377 == this.field373.length) {
                    return this.field373;
                }
            }
        }
        return null;
    }
}
