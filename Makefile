.PHONY: clean-docker
clean-docker:
	docker stop study_d
	docker stop study_d_db
	docker container rm study_d
	docker container rm study_d_db
	docker image prune