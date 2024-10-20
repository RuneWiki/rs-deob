package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eq")
public final class class143 implements Runnable {

    @ObfuscatedName("eq.j")
    public InputStream field2172;

    @ObfuscatedName("eq.m")
    public OutputStream field2171;

    @ObfuscatedName("eq.f")
    public Socket field2165;

    @ObfuscatedName("eq.l")
    public boolean field2164 = false;

    @ObfuscatedName("eq.u")
    public class136 field2163;

    @ObfuscatedName("eq.a")
    public class146 field2168;

    @ObfuscatedName("eq.h")
    public byte[] field2169;

    @ObfuscatedName("eq.i")
    public int field2170 = 0;

    @ObfuscatedName("eq.t")
    public int field2167 = 0;

    @ObfuscatedName("eq.k")
    public boolean field2174 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2163 = arg1;
        this.field2165 = arg0;
        this.field2165.setSoTimeout(30000);
        this.field2165.setTcpNoDelay(true);
        this.field2165.setReceiveBufferSize(16384);
        this.field2165.setSendBufferSize(16384);
        this.field2172 = this.field2165.getInputStream();
        this.field2171 = this.field2165.getOutputStream();
    }

    @ObfuscatedName("eq.m(B)V")
    public void method2843() {
        if (this.field2164) {
            return;
        }
        synchronized (this) {
            this.field2164 = true;
            this.notifyAll();
        }
        if (this.field2168 != null) {
            while (this.field2168.field2199 == 0) {
                class127.method692(1L);
            }
            if (this.field2168.field2199 == 1) {
                try {
                    ((Thread) this.field2168.field2205).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2168 = null;
    }

    public void finalize() {
        this.method2843();
    }

    @ObfuscatedName("eq.f(I)I")
    public int method2844() throws IOException {
        return this.field2164 ? 0 : this.field2172.read();
    }

    @ObfuscatedName("eq.l(I)I")
    public int method2845() throws IOException {
        return this.field2164 ? 0 : this.field2172.available();
    }

    @ObfuscatedName("eq.u([BIII)V")
    public void method2849(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2164) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2172.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eq.a([BIIB)V")
    public void method2863(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2164) {
            return;
        }
        if (this.field2174) {
            this.field2174 = false;
            throw new IOException();
        }
        if (this.field2169 == null) {
            this.field2169 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2169[this.field2167] = arg0[arg1 + var5];
                this.field2167 = (this.field2167 + 1) % 5000;
                if ((this.field2170 + 4900) % 5000 == this.field2167) {
                    throw new IOException();
                }
            }
            if (this.field2168 == null) {
                this.field2168 = this.field2163.method2747(this, 3);
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
                        if (this.field2170 == this.field2167) {
                            if (this.field2164) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2170;
                        if (this.field2167 >= this.field2170) {
                            var4 = this.field2167 - this.field2170;
                        } else {
                            var4 = 5000 - this.field2170;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2171.write(this.field2169, var3, var4);
                    } catch (IOException var12) {
                        this.field2174 = true;
                    }
                    this.field2170 = (this.field2170 + var4) % 5000;
                    try {
                        if (this.field2170 == this.field2167) {
                            this.field2171.flush();
                        }
                    } catch (IOException var11) {
                        this.field2174 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2172 != null) {
                        this.field2172.close();
                    }
                    if (this.field2171 != null) {
                        this.field2171.close();
                    }
                    if (this.field2165 != null) {
                        this.field2165.close();
                    }
                } catch (IOException var10) {
                }
                this.field2169 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method769((String) null, var15);
        }
    }
}
