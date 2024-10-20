package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ek")
public final class class143 implements Runnable {

    @ObfuscatedName("ek.f")
    public InputStream field2176;

    @ObfuscatedName("ek.s")
    public OutputStream field2167;

    @ObfuscatedName("ek.q")
    public Socket field2169;

    @ObfuscatedName("ek.g")
    public boolean field2170 = false;

    @ObfuscatedName("ek.m")
    public class136 field2171;

    @ObfuscatedName("ek.t")
    public class146 field2172;

    @ObfuscatedName("ek.j")
    public byte[] field2174;

    @ObfuscatedName("ek.n")
    public int field2168 = 0;

    @ObfuscatedName("ek.l")
    public int field2175 = 0;

    @ObfuscatedName("ek.i")
    public boolean field2173 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2171 = arg1;
        this.field2169 = arg0;
        this.field2169.setSoTimeout(30000);
        this.field2169.setTcpNoDelay(true);
        this.field2169.setReceiveBufferSize(16384);
        this.field2169.setSendBufferSize(16384);
        this.field2176 = this.field2169.getInputStream();
        this.field2167 = this.field2169.getOutputStream();
    }

    @ObfuscatedName("ek.m(I)V")
    public void method2817() {
        if (this.field2170) {
            return;
        }
        synchronized (this) {
            this.field2170 = true;
            this.notifyAll();
        }
        if (this.field2172 != null) {
            while (this.field2172.field2206 == 0) {
                class127.method1962(1L);
            }
            if (this.field2172.field2206 == 1) {
                try {
                    ((Thread) this.field2172.field2205).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2172 = null;
    }

    public void finalize() {
        this.method2817();
    }

    @ObfuscatedName("ek.t(B)I")
    public int method2814() throws IOException {
        return this.field2170 ? 0 : this.field2176.read();
    }

    @ObfuscatedName("ek.j(B)I")
    public int method2802() throws IOException {
        return this.field2170 ? 0 : this.field2176.available();
    }

    @ObfuscatedName("ek.n([BIII)V")
    public void method2823(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2170) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2176.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ek.l([BIII)V")
    public void method2804(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2170) {
            return;
        }
        if (this.field2173) {
            this.field2173 = false;
            throw new IOException();
        }
        if (this.field2174 == null) {
            this.field2174 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2174[this.field2175] = arg0[arg1 + var5];
                this.field2175 = (this.field2175 + 1) % 5000;
                if ((this.field2168 + 4900) % 5000 == this.field2175) {
                    throw new IOException();
                }
            }
            if (this.field2172 == null) {
                this.field2172 = this.field2171.method2714(this, 3);
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
                        if (this.field2175 == this.field2168) {
                            if (this.field2170) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2168;
                        if (this.field2175 >= this.field2168) {
                            var4 = this.field2175 - this.field2168;
                        } else {
                            var4 = 5000 - this.field2168;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2167.write(this.field2174, var3, var4);
                    } catch (IOException var12) {
                        this.field2173 = true;
                    }
                    this.field2168 = (this.field2168 + var4) % 5000;
                    try {
                        if (this.field2175 == this.field2168) {
                            this.field2167.flush();
                        }
                    } catch (IOException var11) {
                        this.field2173 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2176 != null) {
                        this.field2176.close();
                    }
                    if (this.field2167 != null) {
                        this.field2167.close();
                    }
                    if (this.field2169 != null) {
                        this.field2169.close();
                    }
                } catch (IOException var10) {
                }
                this.field2174 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method1532((String) null, var15);
        }
    }
}
