package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("l")
public class class24 {

    @ObfuscatedName("l.a")
    public int field365;

    @ObfuscatedName("l.r")
    public class79 field362;

    @ObfuscatedName("l.u")
    public DataInputStream field364;

    @ObfuscatedName("l.t")
    public byte[] field369 = new byte[4];

    @ObfuscatedName("l.k")
    public int field368;

    @ObfuscatedName("l.x")
    public byte[] field367;

    @ObfuscatedName("l.v")
    public int field363;

    @ObfuscatedName("l.g")
    public long field371;

    public class24(class74 arg0, URL arg1) {
        this.field362 = arg0.method1438(arg1);
        this.field365 = 0;
        this.field371 = class121.method1471() + 30000L;
    }

    @ObfuscatedName("l.a(I)[B")
    public byte[] method189() throws IOException {
        if (class121.method1471() > this.field371) {
            throw new IOException();
        }
        if (this.field365 == 0) {
            if (this.field362.field1383 == 2) {
                throw new IOException();
            }
            if (this.field362.field1383 == 1) {
                this.field364 = (DataInputStream) this.field362.field1381;
                this.field365 = 1;
            }
        }
        if (this.field365 == 1) {
            int var1 = this.field364.available();
            if (var1 > 0) {
                if (this.field368 + var1 > 4) {
                    var1 = 4 - this.field368;
                }
                this.field368 += this.field364.read(this.field369, this.field368, var1);
                if (this.field368 == 4) {
                    int var2 = (new class126(this.field369)).method2383();
                    this.field367 = new byte[var2];
                    this.field365 = 2;
                }
            }
        }
        if (this.field365 == 2) {
            int var3 = this.field364.available();
            if (var3 > 0) {
                if (this.field363 + var3 > this.field367.length) {
                    var3 = this.field367.length - this.field363;
                }
                this.field363 += this.field364.read(this.field367, this.field363, var3);
                if (this.field363 == this.field367.length) {
                    return this.field367;
                }
            }
        }
        return null;
    }
}
