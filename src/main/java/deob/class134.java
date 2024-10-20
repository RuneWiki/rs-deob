package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ek")
public final class class134 extends class330 implements Runnable {

    @ObfuscatedName("ek.s")
    public InputStream field1498;

    @ObfuscatedName("ek.t")
    public OutputStream field1488;

    @ObfuscatedName("ek.v")
    public Socket field1487;

    @ObfuscatedName("ek.j")
    public boolean field1490 = false;

    @ObfuscatedName("ek.l")
    public class130 field1489;

    @ObfuscatedName("ek.n")
    public class136 field1495;

    @ObfuscatedName("ek.w")
    public byte[] field1493;

    @ObfuscatedName("ek.f")
    public int field1491 = 0;

    @ObfuscatedName("ek.o")
    public int field1492 = 0;

    @ObfuscatedName("ek.x")
    public boolean field1496 = false;

    @ObfuscatedName("ek.r")
    public final int field1497;

    @ObfuscatedName("ek.p")
    public final int field1494;

    public class134(Socket arg0, class130 arg1, int arg2) throws IOException {
        this.field1489 = arg1;
        this.field1487 = arg0;
        this.field1497 = arg2;
        this.field1494 = arg2 - 100;
        this.field1487.setSoTimeout(30000);
        this.field1487.setTcpNoDelay(true);
        this.field1487.setReceiveBufferSize(65536);
        this.field1487.setSendBufferSize(65536);
        this.field1498 = this.field1487.getInputStream();
        this.field1488 = this.field1487.getOutputStream();
    }

    @ObfuscatedName("ek.s(S)V")
    public void method2335() {
        if (this.field1490) {
            return;
        }
        synchronized (this) {
            this.field1490 = true;
            this.notifyAll();
        }
        if (this.field1495 != null) {
            while (this.field1495.field1511 == 0) {
                class383.method3882(1L);
            }
            if (this.field1495.field1511 == 1) {
                try {
                    ((Thread) this.field1495.field1510).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1495 = null;
    }

    public void finalize() {
        this.method2335();
    }

    @ObfuscatedName("ek.t(I)I")
    public int method2367() throws IOException {
        return this.field1490 ? 0 : this.field1498.read();
    }

    @ObfuscatedName("ek.v(B)I")
    public int method2338() throws IOException {
        return this.field1490 ? 0 : this.field1498.available();
    }

    @ObfuscatedName("ek.j(IB)Z")
    public boolean method2336(int arg0) throws IOException {
        if (this.field1490) {
            return false;
        } else {
            return this.field1498.available() >= arg0;
        }
    }

    @ObfuscatedName("ek.l([BIII)I")
    public int method2337(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1490) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field1498.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("ek.n([BIII)V")
    public void method2341(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1490) {
            return;
        }
        if (this.field1496) {
            this.field1496 = false;
            throw new IOException();
        }
        if (this.field1493 == null) {
            this.field1493 = new byte[this.field1497];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1493[this.field1492] = arg0[arg1 + var5];
                this.field1492 = (this.field1492 + 1) % this.field1497;
                if ((this.field1494 + this.field1491) % this.field1497 == this.field1492) {
                    throw new IOException();
                }
            }
            if (this.field1495 == null) {
                this.field1495 = this.field1489.method2288(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1492 == this.field1491) {
                            if (this.field1490) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1491;
                        if (this.field1492 >= this.field1491) {
                            var4 = this.field1492 - this.field1491;
                        } else {
                            var4 = this.field1497 - this.field1491;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1488.write(this.field1493, var3, var4);
                    } catch (IOException var12) {
                        this.field1496 = true;
                    }
                    this.field1491 = (this.field1491 + var4) % this.field1497;
                    try {
                        if (this.field1492 == this.field1491) {
                            this.field1488.flush();
                        }
                    } catch (IOException var11) {
                        this.field1496 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1498 != null) {
                        this.field1498.close();
                    }
                    if (this.field1488 != null) {
                        this.field1488.close();
                    }
                    if (this.field1487 != null) {
                        this.field1487.close();
                    }
                } catch (IOException var10) {
                }
                this.field1493 = null;
                break;
            }
        } catch (Exception var15) {
            class409.method5337((String) null, var15);
        }
    }

    @ObfuscatedName("ek.w([BIIB)V")
    public void method2342(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2341(arg0, arg1, arg2);
    }
}
