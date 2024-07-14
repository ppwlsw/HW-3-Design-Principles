# HW-3-Design-Principles


Single Responsibility Principle (SRP) - โค้ดนี้มีหลาย responsibility อยู่ใน method เดียวกัน เช่น การตรวจสอบความถูกต้องของชื่อ, อีเมล, และอายุ รวมถึงการตรวจสอบ domain ของอีเมล การแยกการตรวจสอบเหล่านี้ออกไป จะทำให้โค้ดอ่านง่ายและ maintain ได้ง่ายขึ้น

Open/Closed Principle (OCP) - โค้ดนี้ไม่ได้เปิดรับการขยายและปิดรับการแก้ไขการเพิ่มการตรวจสอบใหม่ ๆ จำเป็นต้องแก้ไข method เดิม

Encapsulation - โค้ดนี้มีการใช้ pattern และ domain ที่ไม่ควรถูก hardcode อยู่ใน method นี้
