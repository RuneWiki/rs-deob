package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eq")
public final class class147 extends class344 implements Runnable {

    @ObfuscatedName("eq.l")
    public InputStream field1580;

    @ObfuscatedName("eq.q")
    public OutputStream field1581;

    @ObfuscatedName("eq.f")
    public Socket field1575;

    @ObfuscatedName("eq.j")
    public boolean field1576 = false;

    @ObfuscatedName("eq.m")
    public class143 field1577;

    @ObfuscatedName("eq.k")
    public class149 field1585;

    @ObfuscatedName("eq.t")
    public byte[] field1579;

    @ObfuscatedName("eq.a")
    public int field1573 = 0;

    @ObfuscatedName("eq.e")
    public int field1578 = 0;

    @ObfuscatedName("eq.i")
    public boolean field1582 = false;

    @ObfuscatedName("eq.y")
    public final int field1583;

    @ObfuscatedName("eq.w")
    public final int field1584;

    public class147(Socket arg0, class143 arg1, int arg2) throws IOException {
        this.field1577 = arg1;
        this.field1575 = arg0;
        this.field1583 = arg2;
        this.field1584 = arg2 - 100;
        this.field1575.setSoTimeout(30000);
        this.field1575.setTcpNoDelay(true);
        this.field1575.setReceiveBufferSize(65536);
        this.field1575.setSendBufferSize(65536);
        this.field1580 = this.field1575.getInputStream();
        this.field1581 = this.field1575.getOutputStream();
    }

    @ObfuscatedName("eq.l(B)V")
    public void method2615() {
        if (this.field1576) {
            return;
        }
        synchronized (this) {
            this.field1576 = true;
            this.notifyAll();
        }
        if (this.field1585 != null) {
            while (this.field1585.field1595 == 0) {
                class399.method2395(1L);
            }
            if (this.field1585.field1595 == 1) {
                try {
                    ((Thread) this.field1585.field1603).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1585 = null;
    }

    public void finalize() {
        this.method2615();
    }

    @ObfuscatedName("eq.q(I)I")
    public int method2590() throws IOException {
        return this.field1576 ? 0 : this.field1580.read();
    }

    @ObfuscatedName("eq.f(I)I")
    public int method2603() throws IOException {
        return this.field1576 ? 0 : this.field1580.available();
    }

    @ObfuscatedName("eq.j(II)Z")
    public boolean method2592(int arg0) throws IOException {
        if (this.field1576) {
            return false;
        } else {
            return this.field1580.available() >= arg0;
        }
    }

    @ObfuscatedName("eq.m([BIIB)I")
    public int method2588(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1576) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field1580.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("eq.k([BIII)V")
    public void method2602(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1576) {
            return;
        }
        if (this.field1582) {
            this.field1582 = false;
            throw new IOException();
        }
        if (this.field1579 == null) {
            this.field1579 = new byte[this.field1583];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1579[this.field1578] = arg0[arg1 + var5];
                this.field1578 = (this.field1578 + 1) % this.field1583;
                if ((this.field1584 + this.field1573) % this.field1583 == this.field1578) {
                    throw new IOException();
                }
            }
            if (this.field1585 == null) {
                this.field1585 = this.field1577.method2553(this, 3);
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
                        if (this.field1578 == this.field1573) {
                            if (this.field1576) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1573;
                        if (this.field1578 >= this.field1573) {
                            var4 = this.field1578 - this.field1573;
                        } else {
                            var4 = this.field1583 - this.field1573;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1581.write(this.field1579, var3, var4);
                    } catch (IOException var12) {
                        this.field1582 = true;
                    }
                    this.field1573 = (this.field1573 + var4) % this.field1583;
                    try {
                        if (this.field1578 == this.field1573) {
                            this.field1581.flush();
                        }
                    } catch (IOException var11) {
                        this.field1582 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1580 != null) {
                        this.field1580.close();
                    }
                    if (this.field1581 != null) {
                        this.field1581.close();
                    }
                    if (this.field1575 != null) {
                        this.field1575.close();
                    }
                } catch (IOException var10) {
                }
                this.field1579 = null;
                break;
            }
        } catch (Exception var15) {
            class425.method5430((String) null, var15);
        }
    }

    @ObfuscatedName("eq.t([BIII)V")
    public void method2596(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2602(arg0, arg1, arg2);
    }
}
