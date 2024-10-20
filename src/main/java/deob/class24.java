package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("q")
public class class24 {

    @ObfuscatedName("q.y")
    public int field370;

    @ObfuscatedName("q.m")
    public class79 field363;

    @ObfuscatedName("q.d")
    public DataInputStream field364;

    @ObfuscatedName("q.k")
    public byte[] field365 = new byte[4];

    @ObfuscatedName("q.n")
    public int field372;

    @ObfuscatedName("q.s")
    public byte[] field362;

    @ObfuscatedName("q.x")
    public int field368;

    @ObfuscatedName("q.b")
    public long field369;

    public class24(class74 arg0, URL arg1) {
        this.field363 = arg0.method1497(arg1);
        this.field370 = 0;
        this.field369 = class121.method1389() + 30000L;
    }

    @ObfuscatedName("q.y(I)[B")
    public byte[] method205() throws IOException {
        if (class121.method1389() > this.field369) {
            throw new IOException();
        }
        if (this.field370 == 0) {
            if (this.field363.field1409 == 2) {
                throw new IOException();
            }
            if (this.field363.field1409 == 1) {
                this.field364 = (DataInputStream) this.field363.field1413;
                this.field370 = 1;
            }
        }
        if (this.field370 == 1) {
            int var1 = this.field364.available();
            if (var1 > 0) {
                if (this.field372 + var1 > 4) {
                    var1 = 4 - this.field372;
                }
                this.field372 += this.field364.read(this.field365, this.field372, var1);
                if (this.field372 == 4) {
                    int var2 = (new class127(this.field365)).method2628();
                    this.field362 = new byte[var2];
                    this.field370 = 2;
                }
            }
        }
        if (this.field370 == 2) {
            int var3 = this.field364.available();
            if (var3 > 0) {
                if (this.field368 + var3 > this.field362.length) {
                    var3 = this.field362.length - this.field368;
                }
                this.field368 += this.field364.read(this.field362, this.field368, var3);
                if (this.field368 == this.field362.length) {
                    return this.field362;
                }
            }
        }
        return null;
    }
}
