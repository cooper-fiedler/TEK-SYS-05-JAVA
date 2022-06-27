--USER VALUES
INSERT INTO users(email, password, first_name, last_name) VALUES ('cooperfiedler@email.com', '$2a$12$qUXA7n2JFkeFunCNjfGQd.KJUVzkSc2k1l9MyD/5z1n7knSh9TMA6', 'Cooper', 'Fiedler');

--WHEEL SIZES
INSERT INTO wheel_sizes(size) VALUES ('27.5');
INSERT INTO wheel_sizes(size) VALUES ('29');

--TERRAIN TYPES
INSERT INTO terrain_types(type) VALUES ('DH');
INSERT INTO terrain_types(type) VALUES ('EN');
INSERT INTO terrain_types(type) VALUES ('AM');
INSERT INTO terrain_types(type) VALUES ('TR');

--FRAMES
INSERT INTO frame_table(brand, model, cost) VALUES ('Specialized', 'Epic Carbon', 6000.55);
INSERT INTO frame_table(brand, model, cost) VALUES ('Specialized', 'StumpJumper', 1546.99); -- AM, 27.5/29
INSERT INTO frame_table(brand, model, cost) VALUES ('Specialized', 'Enduro', 2599.99); -- EN, 29
INSERT INTO frame_table(brand, model, cost) VALUES ('Specialized', 'Demo Race', 2900.99); -- DH, 29
INSERT INTO frame_table(brand, model, cost) VALUES ('Ibis', 'Mojo 4', 1736.99); -- TR/AM, 27.5/29
INSERT INTO frame_table(brand, model, cost) VALUES ('Ibis', 'Ripley', 1699.99); -- TR, 29
INSERT INTO frame_table(brand, model, cost) VALUES ('Ibis', 'Ripmo', 2242.99); -- AM/EN, 29
INSERT INTO frame_table(brand, model, cost) VALUES ('Santa Cruz', 'V10', 4299.99); -- DH, 27.5/29
INSERT INTO frame_table(brand, model, cost) VALUES ('Santa Cruz', 'Tallboy', 3849.99); -- TR/AM, 29
INSERT INTO frame_table(brand, model, cost) VALUES ('Santa Cruz', 'Blur', 3649.99); -- TR, 29
INSERT INTO frame_table(brand, model, cost) VALUES ('Santa Cruz', 'Nomad', 4149.99); -- AM/EN, 27.5
INSERT INTO frame_table(brand, model, cost) VALUES ('Santa Cruz', 'Hightower', 3949.99); -- AM/EN, 29
INSERT INTO frame_table(brand, model, cost) VALUES ('Yeti', 'SB165', 4120.99); -- EN, 27.5
INSERT INTO frame_table(brand, model, cost) VALUES ('Yeti', 'SB150', 4260.99); -- AM/EN, 29
INSERT INTO frame_table(brand, model, cost) VALUES ('Yeti', 'SB130', 4000.99); -- TR/AM, 29
INSERT INTO frame_table(brand, model, cost) VALUES ('Yeti', 'ARC', 3850.99); -- TR, 29
INSERT INTO frame_table(brand, model, cost) VALUES ('Evil', 'Insurgent V3', 3750.99); -- AM/EN, 27.5/29
INSERT INTO frame_table(brand, model, cost) VALUES ('Evil', 'Wreckoning V3', 3750.99); -- DH, 29
INSERT INTO frame_table(brand, model, cost) VALUES ('Evil', 'Following V3', 3750.99); -- TR, 29

--FORKS
INSERT INTO fork_table(brand, model, cost) VALUES ('Fox', '38 Factory', 1249.99); -- AM/EN, 27.5/29
INSERT INTO fork_table(brand, model, cost) VALUES ('Fox', '36 Factory', 1139.99); -- AM/EN, 27.5
INSERT INTO fork_table(brand, model, cost) VALUES ('Fox', '34 Performance', 799.99); --TR, 27.5/29
INSERT INTO fork_table(brand, model, cost) VALUES ('Fox', '40 Float', 1599.99); -- DH, 29
INSERT INTO fork_table(brand, model, cost) VALUES ('RockShox', 'BoXXer', 1408.99); -- DH, 29
INSERT INTO fork_table(brand, model, cost) VALUES ('RockShox', 'Pike', 720.99); -- AM/EN, 27.5/29
INSERT INTO fork_table(brand, model, cost) VALUES ('RockShox', 'Gold RL', 483.99); -- TR, 27.5/29
INSERT INTO fork_table(brand, model, cost) VALUES ('DVO', 'Diamond D1', 958.99); -- AM/EN, 27.5/29
INSERT INTO fork_table(brand, model, cost) VALUES ('DVO', 'Onyx', 1850.99); -- DH, 29
INSERT INTO fork_table(brand, model, cost) VALUES ('DVO', 'Beryl Boost', 632.72); --TR, 27.5

--WHEEL SETS
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('Race Face', 'Next R', 849.99); -- 29
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('Race Face', 'ARC 30', 799.99); -- 29
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('Race Face', 'Turbine R', 499.99); -- 27.5
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('Race Face', 'Aeffect R', 249.99); -- 27.5
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('Industry Nine', 'Hydra', 860.99); -- 29
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('Industry Nine', 'Enduro S', 742.99); -- 27.5
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('Industry Nine', 'Trail', 656.99); -- 29
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('DT Swiss', 'Classic', 248.99); -- 27.5
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('DT Swiss', 'Spline', 368.99); -- 29
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('Hope', 'Fortus 26', 860.99); -- 27.5
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('Hope', 'RD40 Carbon', 950.99); -- 29
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('Hope', '20Five', 926.99); -- 27.5
INSERT INTO wheel_set_table(brand, model, cost) VALUES ('Hope', 'Fortus 30', 985.99); -- 29

--DRIVE TRAINS
INSERT INTO drive_train_table(brand, model, gear_count, cost) VALUES ('Sram', 'XX1', 12, 949.99); --AM/EN/TR
INSERT INTO drive_train_table(brand, model, gear_count, cost) VALUES ('Sram', 'X01', 11, 849.99); --TR/AM/EN/DH
INSERT INTO drive_train_table(brand, model, gear_count, cost) VALUES ('Sram', 'GX', 10, 749.99); --TR/AM/EN/DH
INSERT INTO drive_train_table(brand, model, gear_count, cost) VALUES ('Sram', 'X7', 10, 649.99); --TR/AM/EN/DH
INSERT INTO drive_train_table(brand, model, gear_count, cost) VALUES ('Shimano', 'XTR', 12, 949.99); --AM/EN/TR
INSERT INTO drive_train_table(brand, model, gear_count, cost) VALUES ('Shimano', 'Deore XT', 11, 849.99); --TR/AM/EN/DH
INSERT INTO drive_train_table(brand, model, gear_count, cost) VALUES ('Shimano', 'SLX', 10, 749.99); --TR/AM/EN/DH
INSERT INTO drive_train_table(brand, model, gear_count, cost) VALUES ('Shimano', 'Alivio', 10, 649.99); --TR/AM/EN/DH

--BRAKES
INSERT INTO brake_table(brand, model, cost) VALUES ('Hope', 'Tech 3', 224.99); -- EN/DH
INSERT INTO brake_table(brand, model, cost) VALUES ('Hope', 'Tech 2', 184.99); -- TR/AM
INSERT INTO brake_table(brand, model, cost) VALUES ('Shimano', 'Deore XT', 284.99); -- EN/DH
INSERT INTO brake_table(brand, model, cost) VALUES ('Shimano', 'SLX', 226.99); -- TR/AM
INSERT INTO brake_table(brand, model, cost) VALUES ('Sram', 'Code', 316.99); -- DH
INSERT INTO brake_table(brand, model, cost) VALUES ('Sram', 'Guide', 297.99); -- EN
INSERT INTO brake_table(brand, model, cost) VALUES ('Sram', 'Level', 258.99); -- AM
INSERT INTO brake_table(brand, model, cost) VALUES ('Sram', 'DB8', 187.99); -- TR

-- BIKES
INSERT INTO bike_build_table(id) VALUES (1);
INSERT INTO bike_build_table(id) VALUES (2);
INSERT INTO bike_build_table(id) VALUES (3);
INSERT INTO bike_build_table(id) VALUES (4);

-- BIKE FRAMES
INSERT INTO bike_frame(frame_id, bike_id) VALUES (5, 1);
INSERT INTO bike_frame(frame_id, bike_id) VALUES (16, 2);
INSERT INTO bike_frame(frame_id, bike_id) VALUES (18, 3);
INSERT INTO bike_frame(frame_id, bike_id) VALUES (2, 4);

-- BIKE FORKS
INSERT INTO bike_fork(fork_id, bike_id) VALUES (8, 1);
INSERT INTO bike_fork(fork_id, bike_id) VALUES (3, 2);
INSERT INTO bike_fork(fork_id, bike_id) VALUES (4, 3);
INSERT INTO bike_fork(fork_id, bike_id) VALUES (2, 4);

-- BIKE DRIVE TRAINS
INSERT INTO bike_drive_train(drive_train_id, bike_id) VALUES (3, 1);
INSERT INTO bike_drive_train(drive_train_id, bike_id) VALUES (2, 2);
INSERT INTO bike_drive_train(drive_train_id, bike_id) VALUES (3, 3);
INSERT INTO bike_drive_train(drive_train_id, bike_id) VALUES (2, 4);

-- BIKE BRAKES
INSERT INTO bike_brakes(brake_id, bike_id) VALUES (2, 1);
INSERT INTO bike_brakes(brake_id, bike_id) VALUES (4, 2);
INSERT INTO bike_brakes(brake_id, bike_id) VALUES (3, 3);
INSERT INTO bike_brakes(brake_id, bike_id) VALUES (2, 4);

-- BIKE WHEEL SET
INSERT INTO bike_wheel_set(wheel_set_id, bike_id) VALUES (5, 1);
INSERT INTO bike_wheel_set(wheel_set_id, bike_id) VALUES (2, 2);
INSERT INTO bike_wheel_set(wheel_set_id, bike_id) VALUES (2, 3);
INSERT INTO bike_wheel_set(wheel_set_id, bike_id) VALUES (6, 4);

--JOINERS

--FRAMES x WHEEL SIZES
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 1);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (1, 2);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 2);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 3);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 4);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (1, 5);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 5);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 6);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 7);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (1, 8);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 8);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 9);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 10);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (1, 11);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 12);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (1, 13);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 14);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 15);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 16);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (1, 17);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 17);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 18);
INSERT INTO wheel_sizes_frames(wheel_size_id, frame_id) VALUES (2, 19);

--FRAMES x TERRAIN TYPES
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (4 ,1);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (3 ,2);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (2 ,3);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (1 ,4);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (3 ,5);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (4 ,5);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (4 ,6);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (2 ,7);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (3 ,7);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (1 ,8);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (3 ,9);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (4 ,9);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (4 ,10);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (2 ,11);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (3 ,11);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (2 ,12);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (3 ,12);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (2 ,13);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (2 ,14);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (3 ,14);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (3 ,15);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (4 ,15);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (4 ,16);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (2 ,17);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (3 ,17);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (1 ,18);
INSERT INTO terrain_types_frames(terrain_types_id, frame_id) VALUES (4 ,19);

--FORKS x WHEEL SIZES
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (1, 1);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (2, 1);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (1, 2);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (1, 3);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (2, 3);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (2, 4);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (2, 5);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (1, 6);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (2, 6);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (1, 7);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (2, 7);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (1, 8);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (2, 8);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (2, 9);
INSERT INTO wheel_sizes_forks(wheel_size_id, fork_id) VALUES (1, 10);

--FORKS x TERRAIN TYPES
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (2 ,1);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (3 ,1);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (2 ,2);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (3 ,2);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (4 ,3);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (1 ,4);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (1 ,5);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (2 ,6);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (3 ,6);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (4 ,7);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (2 ,8);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (3 ,8);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (1 ,9);
INSERT INTO terrain_types_forks(terrain_types_id, fork_id) VALUES (4 ,10);

--WHEEL SIZES x WHEEL SETS
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (2, 1);
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (2, 2);
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (1, 3);
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (1, 4);
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (2, 5);
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (1, 6);
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (2, 7);
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (1, 8);
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (2, 9);
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (1, 10);
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (2, 11);
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (1, 12);
INSERT INTO wheel_sizes_wheel_sets(wheel_size_id, wheel_set_id) VALUES (2, 13);

--BRAKES x TERRAIN TYPES
INSERT INTO terrain_types_brakes(terrain_types_id, brake_id) VALUES (1 ,1);
INSERT INTO terrain_types_brakes(terrain_types_id, brake_id) VALUES (2 ,1);
INSERT INTO terrain_types_brakes(terrain_types_id, brake_id) VALUES (3 ,2);
INSERT INTO terrain_types_brakes(terrain_types_id, brake_id) VALUES (4 ,2);
INSERT INTO terrain_types_brakes(terrain_types_id, brake_id) VALUES (1 ,3);
INSERT INTO terrain_types_brakes(terrain_types_id, brake_id) VALUES (2 ,3);
INSERT INTO terrain_types_brakes(terrain_types_id, brake_id) VALUES (3 ,4);
INSERT INTO terrain_types_brakes(terrain_types_id, brake_id) VALUES (4 ,4);
INSERT INTO terrain_types_brakes(terrain_types_id, brake_id) VALUES (1 ,5);
INSERT INTO terrain_types_brakes(terrain_types_id, brake_id) VALUES (2 ,6);
INSERT INTO terrain_types_brakes(terrain_types_id, brake_id) VALUES (3 ,7);
INSERT INTO terrain_types_brakes(terrain_types_id, brake_id) VALUES (4 ,8);

--DRIVE TRAINS x TERRAIN TYPES
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (2 ,1);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (3 ,1);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (4 ,1);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (1 ,2);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (2 ,2);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (3 ,2);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (4 ,2);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (1 ,3);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (2 ,3);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (3 ,3);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (4 ,3);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (1 ,4);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (2 ,4);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (3 ,4);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (4 ,4);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (2 ,5);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (3 ,5);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (4 ,5);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (1 ,6);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (2 ,6);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (3 ,6);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (4 ,6);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (1 ,7);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (2 ,7);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (3 ,7);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (4 ,7);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (1 ,8);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (2 ,8);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (3 ,8);
INSERT INTO terrain_types_drive_trains(terrain_types_id, drive_train_id) VALUES (4 ,8);





