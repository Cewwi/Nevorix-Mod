scepter = new UnitType("scepter"){{
            speed = 0.36f;
            hitSize = 22f;
            rotateSpeed = 2.1f;
            health = 9000;
            armor = 10f;
            mechFrontSway = 1f;
            ammoType = new ItemAmmoType(Items.thorium);

            mechStepParticles = true;
            stepShake = 0.15f;
            singleTarget = true;
            drownTimeMultiplier = 4f;

            abilities.add(new ShieldRegenFieldAbility(25f, 250f, 60f * 1, 60f));

            BulletType smallBullet = new BasicBulletType(3f, 10){{
                width = 7f;
                height = 9f;
                lifetime = 50f;
            }};

            weapons.add(
            new Weapon("scepter-weapon"){{
                top = false;
                y = 1f;
                x = 16f;
                shootY = 8f;
                reload = 45f;
                recoil = 5f;
                shake = 2f;
                ejectEffect = Fx.casing3;
                shootSound = Sounds.bang;
                inaccuracy = 3f;

                shoot.shots = 3;
                shoot.shotDelay = 4f;

                bullet = new BasicBulletType(8f, 80){{
                    width = 11f;
                    height = 20f;
                    lifetime = 27f;
                    shootEffect = Fx.shootBig;
                    lightning = 2;
                    lightningLength = 6;
                    lightningColor = Pal.surge;
                    //standard bullet damage is far too much for lightning
                    lightningDamage = 20;
                }};
            }},
            new Weapon("scepter-weapon"){{
                top = false;
                y = 3f;
                x = 19f;
                shootY = 8f;
                reload = 45f;
                recoil = 5f;
                shake = 2f;
                ejectEffect = Fx.casing3;
                shootSound = Sounds.bang;
                inaccuracy = 3f;

                shoot.shots = 3;
                shoot.shotDelay = 4f;

                bullet = new BasicBulletType(8f, 80){{
                    width = 11f;
                    height = 20f;
                    lifetime = 27f;
                    shootEffect = Fx.shootBig;
                    lightning = 2;
                    lightningLength = 6;
                    lightningColor = Pal.surge;
                    //standard bullet damage is far too much for lightning
                    lightningDamage = 20;
                }};
            }},
            new Weapon("mount-weapon"){{
                reload = 13f;
                x = 8.5f;
                y = 6f;
                rotate = true;
                ejectEffect = Fx.casing1;
                bullet = smallBullet;
            }},
            new Weapon("mount-weapon"){{
                reload = 16f;
                x = 8.5f;
                y = -7f;
                rotate = true;
                ejectEffect = Fx.casing1;
                bullet = smallBullet;
            }}
            );
        }};
